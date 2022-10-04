package about_vehicle;

public class Car extends Vehicle {
    @Override
    int vehicleSpeed(String vehicleModel) {
        System.out.println("inside car");
        return 120;
    }
}
