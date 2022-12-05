package CreationalDesignPattern.Prototype;

public class CarImp1 {
    public String brand;
    public String model;
    public Integer doors;


    public CarImp1(){}

    public CarImp1 setClone() {
        CarImp1 clonCar = new CarImp1();
        clonCar.brand = brand;
        clonCar.model = model;
        clonCar.doors = doors;
        return clonCar;
    }

    @Override
    public String toString() {
        return "CarImp1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                '}';
    }
}
