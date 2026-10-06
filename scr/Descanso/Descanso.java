package Descanso;


public class Descanso {
    private int HorasDescanso;
    private int NumeroSemanas;

    public void Descanso() {
        this.HorasDescanso = 0;
        this.NumeroSemanas = 1;
    }

    public void defineHorasDescanso(int i){
        this.HorasDescanso = i;
    }
    public void defineNumeroSemanas(int i){
        this.NumeroSemanas = i;
    }

    public String getStatusGeral() {
        if (HorasDescanso / NumeroSemanas < 26) {
            return "cansado";
        }
            return "descansado";
        }
    }


