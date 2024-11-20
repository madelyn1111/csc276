
public class PartTimeEmployee extends Employee{
    public double hourlyRate;
    public double hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, String SSN, double hourlyRate, double hoursWorked) {
        super(name, SSN);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Default Constructor
    public PartTimeEmployee(){
        super();
        hourlyRate = 0.0;
        hoursWorked = 0.0;
    }

    @Override
    public void calculatePay(){
        System.out.printf("Hourly Rate: $%.2f, Hours Worked: %.2f", hourlyRate, hoursWorked);
        System.out.printf("\nPay: $%.2f", (hourlyRate * hoursWorked));
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("(Part Time Employee)");
    }

    // Setters and Getters
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
