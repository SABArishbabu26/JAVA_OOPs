package learning_java;

import java.util.Scanner;

public class FindPrimeNumber {
    static FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

    public boolean findPrime(int input){
        int i=2;
        boolean isPrime=true;

        while(i < input) {
            if (input % i == 0) {
               isPrime = false;
               break;
            }
            ++i;
        }
        return isPrime;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        boolean prime = findPrimeNumber.findPrime(number);
        System.out.println(prime);
    }
}