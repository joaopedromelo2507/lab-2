package lp2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoEsperado;

    public  RegistroTempoOnline(String nomeDisciplina, int tempoEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
        this.tempoOnline = 0;

    }
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
        this.tempoOnline = 0;
    }

    public void adicionaTempoOnline(int i){
        tempoOnline += i;
    }

    public boolean atingiuMetaTempoOnline(){
        if (tempoOnline / tempoEsperado >= 1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnline + "/" + tempoEsperado;
    }
}
