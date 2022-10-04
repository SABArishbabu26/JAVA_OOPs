package learning_java;

public class EmployeeLeave {
    EmployeeImpl employeeImpl;
    public EmployeeLeave() {
        System.out.println("inside constructor");
    }

    public EmployeeLeave(EmployeeImpl employeeImpl){
        this.employeeImpl = employeeImpl;
        System.out.println("inside parameterized constructor");
    }

    public Employee getEmployeeLeaveDetails(String employeeId){
        Employee employee = new Employee();
        employee.setEmployeeName("Sabarish");
        //employee.setId("1");
        employee.setLeaveBalance(10);
        employeeImpl.getEmployeeDetails("name");
        return employee;
    }

    public static void main(String[] args) {
        EmployeeImpl employee = new EmployeeImpl();
        EmployeeLeave employeeLeave = new EmployeeLeave(employee);
        Employee result = employeeLeave.getEmployeeLeaveDetails("1");
        System.out.println(result.getEmployeeName());
        System.out.println(result.getId());
        System.out.println(result.getSalary());
        System.out.println(result.getLeaveBalance());
    }
}
