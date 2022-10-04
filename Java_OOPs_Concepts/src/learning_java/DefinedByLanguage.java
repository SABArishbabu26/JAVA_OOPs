package learning_java;

import java.util.Scanner;

public class DefinedByLanguage {
    static DefinedByLanguage definedByLanguage=new DefinedByLanguage();

    public static String byLanguage(String input1){
     String output;

     switch (input1){
         case "tamil":
             output="tamilnadu";
             break;
         case "english":
             output="america";
             break;
         case "french":
             output="france";
             break;
         default:
             output="germany";
     }
     return output;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your language: ");
        String language = scanner.nextLine();

        String identify = definedByLanguage.byLanguage(language);
        System.out.println("you are from "+ identify);


        Bank hsbc = new Hsbc();
        Bank hdfc = new Hdfc();

        hsbc.checkBalance("1234");

    }
}
