package BehavioralDesignPattern.Mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy Colega concreto 1");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto 1, envio un mensaje");
        mediator.reenvia(this);
    }
}
