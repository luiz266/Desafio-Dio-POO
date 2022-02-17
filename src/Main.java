import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();     //nao da para instanciar a classe conteudo pois
        Conteudo conteudo1 = new Mentoria();                     // entra o polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao(" Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Luiz");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luiz:" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteudos Concluidos Luiz:" + dev.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Luiz:" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXP());

        System.out.println("------");

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João:" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos João:" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXP());
    }
}
