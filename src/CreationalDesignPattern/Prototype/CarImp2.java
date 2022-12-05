package CreationalDesignPattern.Prototype;

public class CarImp2 implements Cloneable{
    public String brand;
    public String model;
    public Integer doors;

    public CarImp2(){}

    public CarImp2 setClone() throws CloneNotSupportedException{
        return (CarImp2)this.clone();
    }

    @Override
    public String toString() {
        return "CarImp2{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                '}';
    }
}
