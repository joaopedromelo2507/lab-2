package lp2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas = new double[4];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas){
        horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }
    public boolean aprovado(){
        int soma = 0;
        for (int i = 0; i < 4; i++){
            soma += notas[i];
        }
        if (soma / 4 >= 7){
            return true;
        }
        else{
            return false;
        }
    }
    private double calculaMedia(){
        int soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma/4;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}
