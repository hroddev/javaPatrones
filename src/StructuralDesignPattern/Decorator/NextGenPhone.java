package StructuralDesignPattern.Decorator;

public class NextGenPhone extends PhoneDecorator{
    public NextGenPhone(Telephone telephone) {
        super(telephone);
    }

    @Override
    public void created() {
        super.created();
        System.out.println("   -> next gen phone: I have 5G");
        System.out.println("   -> next gen phone: I have VoLTE");
    }
}
