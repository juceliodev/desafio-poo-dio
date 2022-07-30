package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    /*O LinkedHashSet nao permite duplicacao de valores e garante a ordem de insercao*/
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();

    public void increverNoBootcamp(Bootcamp bootcamp){
        bootcamp.getDevsInscritos().add(this);
        this.conteudosInscritos.addAll(bootcamp.getConteudosBootcamp());
    }

    public void progredir(){

        Optional<Conteudo> conteudos = conteudosInscritos.stream().findFirst();

        if (conteudos.isPresent()){
            conteudosConcluidos.add(conteudos.get());
            this.conteudosInscritos.remove(conteudos.get());
        }else{
            System.err.println("Voce nao esta matriculado em nenhum Conteudo!");
        }
    }

    public double calcularTotalXP(){
        return this.conteudosConcluidos
                .stream()
               // .mapToDouble(conteudo->conteudo.calcularXP())
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
