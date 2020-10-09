package employee;

import java.util.regex.Pattern;

public class Employee {

    private String employeeName;
    private String employeeNumber;
    private String hireDate;
    public Employee(){}

    public Employee(String employeeName, String employeeNumber) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setEmployeeName(String employeeName) {

                this.employeeName = employeeName;


    }

    public void setEmployeeNumber(String employeeNumber) {
        if (employeeName != null) {
            if (employeeName.matches("[0-9]{3}-[A-M]"))
                this.employeeNumber = employeeNumber;
        }
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
