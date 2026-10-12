package lp2;

import java.util.Arrays;

public class Coisa {
    public static void main(String[] args) {
        registrarDescanso();
        System.out.println("-----");
        registrarTempoOnline();
        System.out.println("-----");
        controlarDisciplina();
        System.out.println("-----");
        registrarResumos();
    }
    public static void registrarDescanso() {
        Descanso descanso = new Descanso();
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(30);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(2);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
    }
    private static void registrarTempoOnline() {
        RegistroTempoOnline tempoLP2 = new RegistroTempoOnline("LP2", 30);
        tempoLP2.adicionaTempoOnline(10);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        tempoLP2.adicionaTempoOnline(10);
        tempoLP2.adicionaTempoOnline(10);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        tempoLP2.adicionaTempoOnline(2);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        System.out.println(tempoLP2.toString());
        RegistroTempoOnline tempoP2 = new RegistroTempoOnline("P2");
        System.out.println(tempoP2.toString());
    }
    private static void controlarDisciplina() {
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2.toString());
        Disciplina teste = new Disciplina("teste", 3, new int[]{2, 1, 5});
        teste.cadastraNota(1, 8.0);
        teste.cadastraNota(2, 0.0);
        teste.cadastraNota(3, 8.0);
        System.out.println(teste.aprovado());
        System.out.println(teste.toString());
        Disciplina testando = new Disciplina(5);
        testando.cadastraNota(1, 7.0);
        testando.cadastraNota(2, 7.0);
        testando.cadastraNota(3, 7.0);
        testando.cadastraNota(4, 7.0);
        testando.cadastraNota(5, 7.0);
        System.out.println(testando.aprovado());
        System.out.println(testando.toString());
    }
    private static void registrarResumos() {
        RegistroResumos meusResumos = new RegistroResumos(100);  // 100 resumos

        meusResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");


        String[] resumos = meusResumos.pegaResumos();


        for (int i = 0; i < meusResumos.conta(); i++) {
            System.out.println(resumos[i]);
        }


        System.out.println();
        System.out.println("Resumos: ");
        System.out.println(meusResumos.imprimeResumos());
        System.out.println(meusResumos.temResumo("Classes"));
        System.out.println(meusResumos.temResumo("Objetos"));
        System.out.println(Arrays.toString(meusResumos.busca("Um")));
    }
}

