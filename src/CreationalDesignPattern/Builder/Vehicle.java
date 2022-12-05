package CreationalDesignPattern.Builder;

public class Vehicle {
    public String brand;
    public String motor;
    public Integer doors;
    public String type;

    public String getBrand() {
        return brand;
    }

    public String getMotor() {
        return motor;
    }

    public Integer getDoors() {
        return doors;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", motor='" + motor + '\'' +
                ", doors=" + doors +
                ", type='" + type + '\'' +
                '}';
    }
}
