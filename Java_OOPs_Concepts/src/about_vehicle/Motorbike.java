package about_vehicle;

public class Motorbike extends Yamaha {


    @Override
    public String bikeType(String type) {

        return "Name: Yamaha MT";
    }

    @Override
    public String price(double a) {
        String output;
        output = String.valueOf(175000.50);
        System.out.println("price is: "+output);
        return "price is: "+output;
    }

    public static void main(String[] args) {
        Yamaha yamahaBike = new Motorbike();
        Yamaha yamahaScooter = new Scooter();
        yamahaBike.price(20.0);
        yamahaScooter.price(10.0);
    }

}
