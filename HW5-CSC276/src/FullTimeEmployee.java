
public class FullTimeEmployee extends Employee {
    public double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, String SSN, int monthlySalary) {
        super(name, SSN);
        this.monthlySalary = monthlySalary;
    }

    // Default constructor
    public FullTimeEmployee(){
        super();
        monthlySalary = 0;
    }

    @Override
    public void calculatePay(){
        System.out.printf("Monthly salary: $%.2f", monthlySalary);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("(Full Time Employee)");
    }

    // Setters and Getters
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }




}
