package about_vehicle;

public class Bike extends Vehicle {
    @Override
    int vehicleSpeed(String vehicleModel) {
        System.out.println("inside bike");
        return 0;
    }

    @Override
    public String drive(String vehicleModel){
        super.drive("yamaha");
        System.out.println("inside bike many specifications");
        return "inside bike many specifications";
    }
}
