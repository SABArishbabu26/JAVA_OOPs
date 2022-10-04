package learning_java;

import java.util.Scanner;

public class NextFiveNumbers {
    static NextFiveNumbers increase = new NextFiveNumbers();

    /*public void findNextFiveNumbers(int input){
        int n=input;
        for(int count = 1; count<=5; count++){
            n = n+1;
            System.out.println(n);
        }
    }*/

    public void findNextFiveNumbers(int input) {
        //int number = input;
        int count = 0;
        while (count <= 4) {
            input = input+1;
            System.out.println(input);
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter n =");
        int n = scanner.nextInt();
        //increase.findNextFiveNumbers(n);
        increase.findNextFiveNumbers(n);

    }
}
