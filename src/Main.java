import br.com.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

     // Conteudo conteudo = new Curso();   // IDEIA POLIMORFISMO
     // Conteudo conteudo2 = new Mentoria();   // IDEIA POLIMORFISMO



        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso JAVA");
        curso1.setCargaHoraria(4);

        curso2.setTitulo("Curso Java Avancado");
        curso2.setDescricao("Descricao Curso JAVA Avancado");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descricao Bootcamp JAVA Developer");
        bootcampJava.getConteudosBootcamp().add(curso1);
        bootcampJava.getConteudosBootcamp().add(curso2);
        bootcampJava.getConteudosBootcamp().add(mentoria);


        Dev devJucelio = new Dev();
        devJucelio.setNome("Jucelio");

        devJucelio.increverNoBootcamp(bootcampJava);

       System.out.println("Conteudos inscritos:" + devJucelio.getConteudosInscritos());
        System.out.println("XP:"+devJucelio.calcularTotalXP());
        System.out.println("Conteudos concluidos:" + devJucelio.getConteudosConcluidos());

        devJucelio.progredir();
        devJucelio.progredir();

        System.out.println("Conteudos inscritos:" + devJucelio.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Jucelio:" + devJucelio.getConteudosConcluidos());
        System.out.println("XP:"+devJucelio.calcularTotalXP());

    }
}
