package learning_java;

import java.util.Scanner;

public class EvenOrOdd {
    private static EvenOrOdd evenOrOdd=new EvenOrOdd();

    public boolean findEvenOdd(int a){
    boolean output = false;
      switch (a % 2){
          case 0:
              output = true;
              //System.out.println(a + " "+ "is even number");
              break;
          default:
              output = false;
             // System.out.println(a + " "+ "is odd number");
      }
      /*if(a%2 == 0){
          System.out.println(a + " "+ "is even number");
      }else {
          System.out.println(a + " "+ "is odd number");
      }*/
          return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a =");
        int a = scanner.nextInt();
        boolean result = evenOrOdd.findEvenOdd(a);
        if(result){
            System.out.println(a + " "+ "is even number");
        }else {
            System.out.println(a + " "+ "is odd number");
        }


    }
}
