package about_vehicle;

import main.TestClass;

public class ProtectedRandom extends TestClass {

    protected void testMethod(int i){

        System.out.println("inside ProtectedRandom1");
    }

    public static void main(String[] args) {
        ProtectedRandom protectedRandom = new ProtectedRandom();
        protectedRandom.testMethod(2);

        /*StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("learningJava");
        stringBuffer.append("string");
        stringBuffer.append("char");
        System.out.println(stringBuffer.toString());*/

        StringBuilder test = new StringBuilder();
        for(int i=0;i<=5;i++){
            test.append(i).append(",");
        }
        test.trimToSize();
        System.out.println(test);

        protectedRandom.testMethod1(2);

        Vehicle bike = new Bike();
        bike.vehicleSpeed("MT15");
        bike.drive("MT15");
    }

    @Override
    public void testMethod1(int a){
        super.testMethod1(2);
        System.out.println("Inside ProtectedRandom");
    }
}
