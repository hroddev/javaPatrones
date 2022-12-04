package Builder;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new CarBuilder("Toyoya")
                .setType("Hybrid")
                .setDoors(4)
                .setMotor("V8")
                .build();

        System.out.println(car);
    }
}
