
public class Main {
    public static void main(String[] args) {
        // New objects
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee("Ben", 165, 756.35);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Maria", 167, 18.50, 45);

        System.out.println("*****Employee*****");
        System.out.println("---Weekly Employee---");
        weeklyEmployee.displayDetails(); // Displays info
        System.out.printf("Calculated pay: %.2f", weeklyEmployee.calculatePay()); // Calls overwritten calculate pay function
        System.out.println("\n---Hourly Employee---");
        hourlyEmployee.displayDetails();// Displays info
        System.out.printf("Calculated pay: %.2f", hourlyEmployee.calculatePay());// Calls overwritten calculate pay function

    }
}