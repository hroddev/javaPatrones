package CreationalDesgnPattern.Builder;

public class CarBuilder {

    Vehicle vehicle;

    public CarBuilder(String brand){
        vehicle = new Vehicle();
        vehicle.brand = brand;
    }

    public CarBuilder setDoors(Integer doors){
        vehicle.doors = doors;
        return this;
    }

    public CarBuilder setType(String type){
        vehicle.type = type;
        return this;
    }

    public CarBuilder setMotor(String motor){
        vehicle.motor = motor;
        return this;
    }

    public Vehicle build() {
        return vehicle;
    }
}
