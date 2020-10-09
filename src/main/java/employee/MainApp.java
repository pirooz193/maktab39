package employee;

public class MainApp {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("pirooz");
        employee.setEmployeeNumber("1379-P");
        System.out.println(employee.getEmployeeNumber());
    }
}
