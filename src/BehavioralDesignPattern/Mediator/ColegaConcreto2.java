package BehavioralDesignPattern.Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy Colega concreto 2");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto 2, envio un mensaje");
        mediator.reenvia(this);
    }
}
