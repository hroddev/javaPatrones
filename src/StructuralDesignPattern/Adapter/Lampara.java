package StructuralDesignPattern.Adapter;

public class Lampara implements Enchufable {
    boolean encendido = false;

    @Override
    public void enciende() {

        encendido = true;
        System.out.println("Lampara encendida");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Lampara apagada");
    }

    @Override
    public boolean estaEncendido() {

        System.out.println("Lampara " + encendido);
        return encendido;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "encendido=" + encendido +
                '}';
    }
}
