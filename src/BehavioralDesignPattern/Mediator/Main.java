package BehavioralDesignPattern.Mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new MediatorConcreto();

        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();

        mediator.registrar(colega1);
        mediator.registrar(colega2);
        mediator.registrar(colega3);

        colega1.envia();
        colega3.envia();
    }
}
