package learning_java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;


public class CustomException {
    public void testClass(){
        try {
            File file = new File("E:\\VISA Docs");
            String pathName = file.getAbsolutePath();
            Path paths = Paths.get("E:\\VISA Docs\\Appointment Confirmation");
            new String(Base64.getEncoder().encodeToString(Files.readAllBytes(paths)));
        } catch (IOException | NumberFormatException | MyException test){
            test.printStackTrace();
        }
        Integer n = Integer.parseInt("10");
        System.out.println(n);
    }

    public void testClassThro() throws IOException{
            File file = new File("E:\\VISA Docs");
            String pathName = file.getAbsolutePath();
            Path paths = Paths.get("E:\\VISA Docs\\Appointment Confirmation");
            new String(Base64.getEncoder().encodeToString(Files.readAllBytes(paths)));

        Integer n = Integer.parseInt("10");
        System.out.println(n);
    }

    public void unCheckedTest(String input) throws NullPointerException{
        /*Integer n = Integer.parseInt("10");
        System.out.println(n);*/
        //if(input != null) {
            Integer n1 = Integer.parseInt(input);
            System.out.println(n1);
        //}
    }
    public static void main(String[] args) throws IOException {
        CustomException customException = new CustomException();
        customException.unCheckedTest("12");
        customException.unCheckedTest(null);

    }
}

/*java.lang.Throwable

Exception -- Error
Checked exception -> compile time exception (IOException, SQLException)
Unchecked Exception -> Run time exception (NumberFormatException, ArrayIndexOutOfBoundsException, NullPointerException)*/


//Polymorphism - many forms - OOPs concept
//Compile time polymorphism or static binding - method overloading
    // exists within same class
    // method has same name but different parameters (number of parameters or datatype of paramaters)
    //return type can be same or different
//Runtime polymorphisam or dynamic binding - method overriding
    //exists in parent and child class
    // same method name with same parameters and same return type
    // has paraent and child relationship (inheritance)
    // only the method implementation can be different

//inheritance, Polymorphism, abstraction, Data Encapsulation