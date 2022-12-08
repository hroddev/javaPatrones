package BehavioralDesignPattern.Mediator;

abstract public class Colega {
    public Mediator mediator;

        public void setMediator(BehavioralDesignPattern.Mediator.Mediator mediator) {
            this.mediator = mediator;
        }

        abstract void recibe();
        abstract void envia();
    }

