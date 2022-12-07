package BehavioralDesignPattern.Observer;

public class Main {

    public static void main(String[] args) {

        Emisora emisora = new Emisora();

        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();
        ReceptorTV tv = new ReceptorTV();

        emisora.meteReceptor(radio);
        emisora.meteReceptor(satelite);
        emisora.meteReceptor(tv);

        emisora.emite();
    }
}
