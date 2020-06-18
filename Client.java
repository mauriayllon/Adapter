package adapter.mauri;

public class Client {
    public static void main (String [] args){

        Electrico electrico= new Electrico();

        // misma familia
        Gasolina gasolina = new Gasolina();
        Diesel diesel = new Diesel();
        GasolinaEspecial gasolinaEspecial = new GasolinaEspecial();
        AdapterElectrico adapterElectrico = new AdapterElectrico(electrico);

        gasolina.llenarGasolina();
        gasolina.getEstado();
        System.out.println("//////////");
        diesel.llenarGasolina();
        diesel.getEstado();
        System.out.println("//////////");
        gasolinaEspecial.llenarGasolina();
        gasolinaEspecial.getEstado();
        System.out.println("//////////");
        adapterElectrico.llenarGasolina();
        adapterElectrico.getEstado();




    }
}
