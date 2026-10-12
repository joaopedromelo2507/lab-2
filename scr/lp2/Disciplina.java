package lp2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas = new double[4];
    private int[] pesos;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.pesos = new int[]{1, 1, 1, 1};
    }
    public void cadastraHoras(int horas){
        horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }
    public boolean aprovado(){
        double resultado = calculaMedia();
        if (resultado >= 7){
            return true;
        }
        else{
            return false;
        }
    }
    private double calculaMedia(){
        int soma = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i] * pesos[i];
        }
        for (int i = 0; i < pesos.length; i++){
            somaPesos += pesos[i];
        }
        return soma/ somaPesos;
    }

    public Disciplina(int qtdNotas){
        this.notas = new double[qtdNotas];
        this.pesos = new int[qtdNotas];
        for (int i = 0; i < qtdNotas; i++){
            pesos[i] = 1;
        }
    }

    public Disciplina(String nomeDisciplina, int qtdNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[qtdNotas];
        this.pesos = pesos;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}
