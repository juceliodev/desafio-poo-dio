import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Plataforma DIO");
        curso.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Plataforma DIO");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);


    }
}
