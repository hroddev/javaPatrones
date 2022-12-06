package StructuralDesignPattern.Adapter;

public class LightBulb {

    boolean powerOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        powerOn =true;
        this.voltage = voltage;
    }

    public void turnOff(){
        powerOn = false;
        voltage = 0;
    }

    public boolean isPowerOn(){
        return powerOn;
    }

    @Override
    public String toString() {
        return "LightBulb{" +
                "powerOn=" + powerOn +
                ", voltage=" + voltage +
                '}';
    }
}
