package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    // PlusDays adciona uma quantidade de dias a data inicial
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    // usando Hashset pois a ordem de insercao nao é relevante
    private Set<Dev> devsInscritos = new HashSet<Dev>();
    // utilizando LinkedHashSet para garantir a ordem de insercao que sera relevante
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<Conteudo>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }

    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudosBootcamp, bootcamp.conteudosBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudosBootcamp);
    }
}
