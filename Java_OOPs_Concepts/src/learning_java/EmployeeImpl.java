package learning_java;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {

    public Employee getEmployeeDetails(String employeeId){
        Employee employee = new Employee();
        employee.setEmployeeName("Sabarish");
        employee.setId("1");
        employee.setSalary(100000.00);
        return employee;
    }

    public static void main(String[] args) {
        /*EmployeeImpl employeeImpl = new EmployeeImpl();
        Employee result = employeeImpl.getEmployeeDetails("1");
        System.out.println(result.getEmployeeName());
        System.out.println(result.getId());
        System.out.println(result.getSalary());*/

        int[] intArray = {1,2,34,5};
        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        int[] numArray = new int[4];
        numArray[0] = 1;
        numArray[1] = 10;
        numArray[2] = 11;
        numArray[3] = 23;
        //numArray[4] = 40;
        for(int i=0; i<numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        String[] testArray = {"6576","test"};
    }
}
