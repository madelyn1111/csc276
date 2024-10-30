
public class HourlyEmployee extends Employee {
    private double hourlyRate = 0;
    private int hoursWorked = 0;

    // Constructor for subclass
    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id); // calls for superclass
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Overrides calculate pay method in super class
    @Override
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    // Getters
    public double getHourlyRate() {
        return hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
}
