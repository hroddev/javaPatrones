package CreationalDesignPattern.Factory;

public class PriceFactory {
    private PriceFactory(){}

    Price price;

    public PriceFactory(String country) {
        if (country.equalsIgnoreCase("españa")){
            System.out.println("España, precio en EUROS");
            price = new SpainPrice();
        } else if (country.equalsIgnoreCase("uk")) {
            System.out.println("UK, precio en ");
            price = new UKPrice();
        } else {
            System.out.println("Otro pais, precio en USD");
            price = new USPrice();
        }
    }

    public double getPrice() {
        return price.getPrice();
    }
}
