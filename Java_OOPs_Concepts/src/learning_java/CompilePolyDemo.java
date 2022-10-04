package learning_java;

public class CompilePolyDemo {
    public int sumNumbers(int a,int b){
        return a+b;
    }
    public int sumNumbers(double a, int b){
        return (int) (a+b);
    }
    public int sumNumbers(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        CompilePolyDemo compilePolyDemo = new CompilePolyDemo();
        compilePolyDemo.sumNumbers(1,2);
        compilePolyDemo.sumNumbers(12.5,2);
        compilePolyDemo.sumNumbers(1,2,3);
    }
}
