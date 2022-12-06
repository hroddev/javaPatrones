package StructuralDesignPattern.Adapter;

public class PowerAdapter implements Enchufable {

    public LightBulb lightBulb = new LightBulb();

    boolean encendido = false;

    @Override
    public void enciende() {
        lightBulb.turnOn(110);
        System.out.println("Lightbulb is turn on with voltage 110");
    }

    @Override
    public void apaga() {
        lightBulb.turnOff();
        System.out.println("Lightbulb is turn off");
    }

    @Override
    public boolean estaEncendido() {
        System.out.println("Lightbulb is " + lightBulb.isPowerOn());
        return lightBulb.isPowerOn();
    }
}