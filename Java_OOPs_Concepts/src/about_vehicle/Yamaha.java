package about_vehicle;

import javax.swing.*;
import java.awt.*;

public class Yamaha {

    public String bikeType(String type){

        return null;
    }

    public String price(double a){
        System.out.println("inside parent class");
        return null;
    }


    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bike type: ");
        String name = scanner.nextLine();*/

        String name = JOptionPane.showInputDialog("Enter bike type");


        Motorbike motoByke = new Motorbike();
        String type = motoByke.bikeType(name);
        String price = motoByke.price(000);
        Scooter scooty = new Scooter();
        String scooter = scooty.bikeType(name);
        String sprice = scooty.price(000);

        if(name.equalsIgnoreCase("motorbike")){
            JOptionPane.showMessageDialog(null, type);
            JOptionPane.showMessageDialog(null, price);
            /*System.out.println(type);
            System.out.println(price);*/
        }
        else if (name.equalsIgnoreCase("scooter")){
            JOptionPane.showMessageDialog(null, scooter);
            JOptionPane.showMessageDialog(null, sprice);
            /*System.out.println(scooter);
            System.out.println(sprice);*/
        }
    }
}
