package about_vehicle;

public class Scooter extends Yamaha{

    @Override
    public String bikeType(String type) {

        return "Name: X Ray";
    }

    @Override
    public String price(double a) {
        String output;
        output = String.valueOf(70000);
        System.out.println("price is: "+output);
        return "price is: "+output;
    }

}
