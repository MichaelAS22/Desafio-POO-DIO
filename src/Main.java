import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
         */
        Bootcamp bootcamp  = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMichael = new Dev();
        devMichael.setNome("Michael");
        devMichael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Michael:" + devMichael.getConteudosInscritos());

        devMichael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Michael:" + devMichael.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Michael:" + devMichael.getConteudosConcluidos());
        System.out.println("Xp:" + devMichael.calcularTotalXp());

        System.out.println("-----------");

        Dev devCarimbo = new Dev();
        devCarimbo.setNome("Carimbo Miguel");
        devCarimbo.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Carimbo:" + devCarimbo.getConteudosInscritos());
        devCarimbo.progredir();
        devCarimbo.progredir();
        devCarimbo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Carimbo:" + devCarimbo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Carimbo:" + devCarimbo.getConteudosConcluidos());
        System.out.println("XP:" + devCarimbo.calcularTotalXp());





    }

}

