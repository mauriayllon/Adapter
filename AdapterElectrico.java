package adapter.mauri;

import java.util.Random;

public class AdapterElectrico implements IAuto {
    private Electrico adaptee;

    public AdapterElectrico(Electrico adaptee){
        this.adaptee= adaptee;
    }

    @Override
    public int getEstado() {
        System.out.println("Seteo de Electricidad: "+this.adaptee.EstadoElectricidad());
        return this.adaptee.EstadoElectricidad();
    }

    @Override
    public void llenarGasolina() {
        System.out.println("La capacidad electrica"+this.adaptee.getCap());
    }
}
