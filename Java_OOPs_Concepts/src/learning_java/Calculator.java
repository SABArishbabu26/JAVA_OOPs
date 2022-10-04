package learning_java;

import java.util.Scanner;

public class Calculator {
    Operators operators = new Operators();
    static Calculator calculator = new Calculator();


    /*public String calculate(String calculationType, double inputOne, double inputTwo){
        String output;
        if(calculationType.equalsIgnoreCase("addition")){
            output = operators.addition(String.valueOf(inputOne),String.valueOf(inputTwo));
        }
        else if (calculationType.equalsIgnoreCase("subtraction")){
            output = operators.subtraction(String.valueOf(inputOne),String.valueOf(inputTwo));
        }
        else if (calculationType.equalsIgnoreCase("multiplication")){
            output = operators.multiplication(String.valueOf(inputOne),String.valueOf(inputTwo));
        }
        else if (calculationType.equalsIgnoreCase("division")){
            output = operators.division(String.valueOf(inputOne),String.valueOf(inputTwo));
        }
        else {
            output = operators.modulus(String.valueOf(inputOne),String.valueOf(inputTwo));
        }
        return output;
    }*/

    public String calculateUsingSwitch(String calculationType, double inputOne, double inputTwo){
        String output;
        switch (calculationType){
            case "addition":
                output = operators.addition(String.valueOf(inputOne),String.valueOf(inputTwo));
                break;
            case "subtraction":
                output = operators.subtraction(String.valueOf(inputOne),String.valueOf(inputTwo));
                break;
            case "multiplication":
                output = operators.multiplication(String.valueOf(inputOne),String.valueOf(inputTwo));
                break;
            case "division":
                output = operators.division(String.valueOf(inputOne),String.valueOf(inputTwo));
                break;
            default:
                output = operators.modulus(String.valueOf(inputOne),String.valueOf(inputTwo));
                break;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();

        //calculator.calculate("addition",a,b);
        String result = calculator.calculateUsingSwitch("addition",a,b);
        System.out.println(result);
        String resultTwo = calculator.calculateUsingSwitch("subtraction",a,b);
        System.out.println(resultTwo);
        String resultThree = calculator.calculateUsingSwitch("multiplication",a,b);
        System.out.println(resultThree);
        String resultFour = calculator.calculateUsingSwitch("division",a,b);
        System.out.println(resultFour);
        String resultFive = calculator.calculateUsingSwitch("modulus",a,b);
        System.out.println(resultFive);
    }
}
