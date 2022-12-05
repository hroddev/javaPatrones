package StructuralDesignPattern.Decorator;

public class Smartphone extends PhoneDecorator{
    public Smartphone(Telephone telephone) {
        super(telephone);
    }

    @Override
    public void created() {
        super.created();
        System.out.println("   -> smartphone: I have 4G");
    }
}
