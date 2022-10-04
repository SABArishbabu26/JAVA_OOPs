package learning_java;

public class Operators {
    static Operators operators = new Operators();

    public String addition(String a, String b){
        double input1 = Double.parseDouble(a);
        double input2 = convertToDouble(b);
        double input3 = input1+input2;
        String output = String.valueOf(input3);
        return output;
    }
    public double convertToDouble(String value){
        double result = Double.parseDouble(value);
        return result;
    }
    public String subtraction(String a, String b){
        double input1 = Double.parseDouble(a);
        double input2 = Double.parseDouble(b);
        double input3 = input1-input2;
        String output = String.valueOf(input3);
        return output;
    }
    public String division(String a, String b){
        double input1 = Double.parseDouble(a);
        double input2 = Double.parseDouble(b);
        double input3 = input1/input2;
        String output = String.valueOf(input3);
        return output;
    }
    public String multiplication(String a, String b){
        double input1 = Double.parseDouble(a);
        double input2 = Double.parseDouble(b);
        double input3 = input1*input2;
        String output = String.valueOf(input3);
        return output;
    }
    public  String modulus (String a, String b){
        double input1 = Double.parseDouble(a);
        double input2 = Double.parseDouble(b);
        double input3 = input1%input2;
        String output = String.valueOf(input3);
        return output;
    }
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        Operators operators1 = new Operators();
        String additionResult = operators1.addition("10.5","5");
        System.out.println("Addition result is" + " " + additionResult);
        String subResult = operators.subtraction("5", "15");
        System.out.println("Subtraction result is" + " " + subResult);
        double divisionResult = operators.division(a,b);
        System.out.println("Division result is" + " " + divisionResult);
        double multiplicationResult = operators.multiplication(a,b);
        System.out.println("Multiplication result is" + " " + multiplicationResult);
        double modulusResult = operators.modulus(a,b);
        System.out.println("Modulus result is" + " " + modulusResult);
    }*/
}
