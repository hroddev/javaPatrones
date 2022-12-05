package StructuralDesignPattern.Decorator;

public class Main {

    public static void main(String[] args) {

        BasicPhone basicPhone = new BasicPhone();
        basicPhone.created();

        Smartphone smartphone = new Smartphone(new BasicPhone());
        smartphone.created();

        NextGenPhone nextGenPhone = new NextGenPhone(new Smartphone(new BasicPhone()));
        nextGenPhone.created();
    }
}
