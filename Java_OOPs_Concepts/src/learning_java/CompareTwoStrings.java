package learning_java;

import java.util.Locale;
import java.util.Scanner;

public class CompareTwoStrings {
    static CompareTwoStrings compareTwoStrings= new CompareTwoStrings();

    public boolean checkEquals(String input1, String input2) {

        return (input1.equals(input2));
    }

    public boolean equalsIgnoreCase(String input1, String input2) {
        if (input1.equalsIgnoreCase(input2)) {
            return true;
        }
            return false;
    }

    public boolean isEmpty(String input1) {
        return input1.isEmpty();
    }

    public boolean isBlank (String input1) {
        if (input1.isBlank()) {
            return true;
        }
            return false;
    }

    public char charAt(String input) {
            if(input.length() >= 6) { //length starts from 1
                return input.charAt(5); //character and index starts from 0
            }
            return 'X';
            }

    public String toUpperCase (String input1) {
        return input1.toUpperCase(Locale.ROOT);
    }

    public String toLowerCase (String input1) {
        return input1.toLowerCase(Locale.ROOT);
    }

    public int checkLength(String input){

        return input.length();
    }

    public boolean checkStartsWith(String input,String checkSeq){
        return input.startsWith(checkSeq);
    }
    public boolean endsStartsWith(String input,String checkSeq){
        return input.endsWith(checkSeq);
    }
    public boolean contain(String input,String checkSeq){
        return input.contains(checkSeq);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1");
        String input1 = scanner.next();
        System.out.println("Enter String 2");
        String input2 = scanner.next();
        boolean equal = compareTwoStrings.checkEquals(input1,input2);
        System.out.println("Result is " + equal);
        boolean equal1 = compareTwoStrings.equalsIgnoreCase(input1,input2);
        System.out.println("Result is " + equal1);
        boolean empty = compareTwoStrings.isEmpty(input1);
        System.out.println("1st empty Result is " + empty);
        boolean empty1 = compareTwoStrings.isEmpty(input2);
        System.out.println("2nd empty Result is " + empty1);
        boolean blank = compareTwoStrings.isBlank(input1);
        System.out.println("1st blank Result is " + blank);
        boolean blank1 = compareTwoStrings.isBlank(input1);
        System.out.println("2nd blank Result is " + blank1);
        char findcahr = compareTwoStrings.charAt(input1);
        System.out.println("it is = " + findcahr);
        String upper = compareTwoStrings.toUpperCase(input1);
        System.out.println(upper);
        String upper1 = compareTwoStrings.toUpperCase(input2);
        System.out.println(upper1);
        String lower = compareTwoStrings.toLowerCase(input1);
        System.out.println(lower);
        String lower1 = compareTwoStrings.toLowerCase(input2);
        System.out.println(lower1);
        int length = compareTwoStrings.checkLength(input1);
        System.out.println("String 1 length is" + length);
        int lengthTwo = compareTwoStrings.checkLength(input2);
        System.out.println("String 2 length is" + lengthTwo);

        boolean startsWith = compareTwoStrings.checkStartsWith(input1,"S");
        System.out.println(startsWith);
        boolean endsWith = compareTwoStrings.endsStartsWith(input2,"a");
        System.out.println(endsWith);
        boolean contains = compareTwoStrings.contain(input1, "r");
        System.out.println(contains);
    }
}
