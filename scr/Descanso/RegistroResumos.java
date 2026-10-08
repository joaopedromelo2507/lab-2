package Descanso;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int numeroDeResumos;
    private int indice = 0;
    private String[] resumos;

    public RegistroResumos(int numeroDeResumos){
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
    }
    public void adiciona(String tema, String conteudo){
        temas[indice] = tema;
        conteudos[indice] = conteudo;
        resumos[indice] = tema + ": " + conteudo;
        indice++;
    }

    public String[] pegaResumos(){
        return resumos;
    }
    public String imprimeResumos(){
        String resultado = "- " + indice + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0;i < indice; i++){
            if (i < indice -1){
                resultado += temas[i] + " | ";
            }
            else{
                resultado += temas[i];
            }
        }
        return resultado;
    }
    public int conta(){
        return indice;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < indice; i++){
            if (temas[i].equals(tema)){
                return true;
            }
        }
        return false;
    }
}
