package Factory;

public class Main {

    public static void main(String[] args) {

        PriceFactory spain = new PriceFactory("españa");
        System.out.println(spain.getPrice());

        PriceFactory unitedState = new PriceFactory("usa");
        System.out.println(unitedState.getPrice());

        PriceFactory unitedKindoms = new PriceFactory("uk");
        System.out.println(unitedKindoms.getPrice());
    }
}
