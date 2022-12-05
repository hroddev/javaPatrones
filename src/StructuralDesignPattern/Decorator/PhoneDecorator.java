package StructuralDesignPattern.Decorator;

public class PhoneDecorator implements Telephone {

    private Telephone telephone;

    public PhoneDecorator(Telephone telephone){
        this.telephone = telephone;
    }

    @Override
    public void created() {
        this.telephone.created();
    }
}
