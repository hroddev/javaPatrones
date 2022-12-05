package StructuralDesignPattern.Decorator;

public class BasicPhone implements Telephone {
    @Override
    public void created() {
        System.out.println("I'm a basic phone with these features: ");
        gsm();
        sms();
    }

    private void gsm(){
        System.out.println("   -> basic phone: I have GSM");
    }

    private void sms(){
        System.out.println("   -> basic phone: Ihave SMS");
    }
}
