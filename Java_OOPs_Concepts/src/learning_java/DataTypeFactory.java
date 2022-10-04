package learning_java;

import java.math.BigDecimal;
import java.util.Locale;

public class DataTypeFactory {

    public static void main(String[] args) {
        int i = 10; //default value 0
        char test = 'S'; //no default
        String in = "tEst string"; //default null
        String ou = "Test string";
        double value = 10.0; //default value 0.0
        long a = 10L; //0L default
        BigDecimal inp = BigDecimal.valueOf(10.07689546);
        inp.add(BigDecimal.valueOf(10.0));
        double output = value + 15.0;
        float fl = 10.0f; //default 0.0f
        boolean flag = true; //default false
            //String -> equals or equalsIgnoreCase
            if(in.equalsIgnoreCase(ou)){ //treue or false
                in.equals(ou); //true or fa;se
                in.endsWith("g"); // true or false
                in.toLowerCase(Locale.ROOT);
                in.toUpperCase(Locale.ROOT);
                int leng = in.length();
                System.out.println("length " +leng);
                in.isEmpty(); //returns boolean
                in.isBlank(); // true or false
                in.contains("str"); //true or false
                char sequ = in.charAt(0);
                System.out.println("sequence " +sequ);
            }

            if(value == output){
                if(value != output){
                    boolean b = value > output;
                    //boolean  value < output;
                    //>=, <=

                }
            }
            for( ; a<=5; ){
                System.out.println();
            }
        }

        /*to create object for any class
    1. using interface - interfacename objectname = new classname();
    2. using parent class - parentclassname variablename = new classname();
    3. using self class name - classname variablename = new classname();*/

        /*all in one class with 3 diff methods
        1.method to print next 5 numbers using for loop
        2. NEXT 5 numbers using while loop
        3. get i/p from user and check if it's ever or prime number'*/

        /*different class
        1. get 2 string inputs from the user
        2. check if the contents are equal
        3. check if content equal and also case
        4. check the length of 2 strings
        5. blank or empty strings
        6. check the 4th character in both the strings (first check if the string length greater or equal to 4)
        7. change the strings to lower case and upper case*/

}


//int, float, long, double,char

//String, Bigdecimal, Integer, Double,Long - wrapper class