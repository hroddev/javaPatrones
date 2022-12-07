package BehavioralDesignPattern.Observer;

public class ReceptorTV implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Recibe señal desde TV");
    }
}
