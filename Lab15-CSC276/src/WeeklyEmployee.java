
public class WeeklyEmployee extends Employee {
    private double weeklySalary = 0;

    // Constructor
    public WeeklyEmployee(String name, int id, double weeklySalary) {
        super(name, id); // calls for super class
        this.weeklySalary = weeklySalary;
    }

    // Overrides calculate pay method from superclass
    @Override
    public double calculatePay() {
        return getWeeklySalary();
    }

    // Getters
    public double getWeeklySalary() {
        return weeklySalary;
    }

}



