package learning_java;

public class Hsbc implements Bank{
    @Override
    public double checkBalance(String accountNum) {//parameter
        System.out.println("from hsbc");
        return 1;
    }

    @Override
    public void transferMoney() {

    }

    @Override
    public void printStatement() {

    }

    public String extraMethod(){
        return "test";
    }

}
