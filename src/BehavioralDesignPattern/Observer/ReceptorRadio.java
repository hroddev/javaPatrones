package BehavioralDesignPattern.Observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Recibe señal desde Radio");
    }
}
