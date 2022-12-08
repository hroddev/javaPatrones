package BehavioralDesignPattern.Mediator;

public class ColegaConcreto3 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy Colega concreto 3");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto 3, envio un mensaje");
        mediator.reenvia(this);
    }
}