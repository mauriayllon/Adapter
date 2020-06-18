package adapter.mauri;

import java.util.Random;

public class Electrico {
    int cap;

    public Electrico(){

    }

    public int EstadoElectricidad(){
        Random rnd = new Random();
        int numerorandom= rnd.nextInt(10 - 1 + 1) + 1;
        return numerorandom;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        Random rnd = new Random();
        int numerorandom= rnd.nextInt(100 - 1 + 1) + 1;
        this.setCap(numerorandom);
    }

}
