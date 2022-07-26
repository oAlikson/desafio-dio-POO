import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição Curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAlikson = new Dev();
        devAlikson.setNome("Alikson");
        devAlikson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Alikson: " + devAlikson.getConteudosInscritos());

        devAlikson.progredir();
        devAlikson.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos de Alikson: " + devAlikson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Alikson: " + devAlikson.getConteudosConcluidos());
        System.out.println("XP: " + devAlikson.calcularTotalXp());

        System.out.println("---------------------------------");

        
        Dev devEmilly = new Dev();
        devEmilly.setNome("Emilly");
        devEmilly.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devEmilly.getConteudosInscritos());

        devEmilly.progredir();
        devEmilly.progredir();
        devEmilly.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos" + devEmilly.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Emilly: " + devEmilly.getConteudosConcluidos());
        System.out.println("XP: " + devEmilly.calcularTotalXp());

    }

}