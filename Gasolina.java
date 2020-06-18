package adapter.mauri;

import java.util.Random;

public class Gasolina implements IAuto {
    int capacidad;
    int estado;

    public Gasolina() {
    }

    @Override
    public int getEstado() {
        Random rnd = new Random();
        int numerorandom= rnd.nextInt(100 - 1 + 1) + 1;
        System.out.println("Estado Gasolina: "+numerorandom);
        return numerorandom;
    }

    @Override
    public void llenarGasolina() {
        Random rnd = new Random();
        int numerorandom= rnd.nextInt(100 - 1 + 1) + 1;
        System.out.println("Seteo de Gasolina: "+numerorandom);
        this.capacidad=numerorandom;
    }
}
