package employee;

public class ProductionWorker extends Employee {

    private int shift;
    private double hourlyPayRate;
    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(employeeName, employeeNumber);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
