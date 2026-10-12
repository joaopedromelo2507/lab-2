package lp2;

import java.util.Arrays;
import java.util.Locale;

public class RegistroResumos {
    private static Resumo[] resumos;
    private static int indice = 0;

    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
    }
    public void adiciona(String tema, String conteudo){
        resumos[indice] = new Resumo(tema, conteudo);
        indice++;
    }

    public String[] pegaResumos(){
        String[] resultado = new String[indice];
        for (int i = 0; i < indice; i++){
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }
    public String imprimeResumos(){
        String resultado = "- " + indice + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0;i < indice; i++){
            if (i < indice -1){
                resultado += resumos[i].getTema() + " | ";
            }
            else{
                resultado += resumos[i].getTema();
            }
        }
        return resultado;
    }
    public int conta(){
        return indice;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < indice; i++){
            if (resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }
    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        String[] temasAchados = new String[indice];
        int posicao = 0;
        for (int i = 0; i < indice; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                temasAchados[posicao] = resumos[i].getTema();
                posicao++;
            }
        }
        String[] resultado = new String[posicao];
        for (int i = 0; i < posicao; i++) {
            resultado[i] = temasAchados[i];
        }
        Arrays.sort(resultado);
        return resultado;
    }
}
