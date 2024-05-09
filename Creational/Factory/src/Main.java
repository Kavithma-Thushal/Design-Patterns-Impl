/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 9:47 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        VehicleFactoryImpl vehicleFactory = new VehicleFactoryImpl();

        Vehicle car = vehicleFactory.createVehicle("Car");
        car.drive();

        Vehicle bike = vehicleFactory.createVehicle("Bike");
        bike.drive();
    }
}

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

interface VehicleFactory {
    Vehicle createVehicle(String type);
}

class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        switch (type) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            default:
                return null;
        }
    }
}
