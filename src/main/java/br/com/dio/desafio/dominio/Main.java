package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso1.setTitulo("curso Phyton");
        curso1.setDescricao("descrição curso Phyton");
        curso1.setCargaHoraria(16);

        Curso curso4 = new Curso();
        curso1.setTitulo("curso C#");
        curso1.setDescricao("descrição curso C#");
        curso1.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);

        bootcamp.getConteudos().add(mentoria);

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ricardo: " + devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ricardo: " + devRicardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ricardo: " + devRicardo.getConteudosConcluidos());
        System.out.println("XP:" + devRicardo.calcularTotalXp());

        System.out.println("-----------");

        Dev devThomas = new Dev();
        devThomas.setNome("Thomas");
        devThomas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thomas: " + devThomas.getConteudosInscritos());
        devThomas.progredir();
        devThomas.progredir();
        devThomas.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thomas: " + devThomas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Thomas: " + devThomas.getConteudosConcluidos());
        System.out.println("XP:" + devThomas.calcularTotalXp());


    }
}
