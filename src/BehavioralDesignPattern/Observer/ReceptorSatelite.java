package BehavioralDesignPattern.Observer;

public class ReceptorSatelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Recibe señal desde Satelite");
    }
}
