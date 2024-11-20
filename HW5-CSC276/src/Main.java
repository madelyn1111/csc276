import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Making an Array hold employee
        ArrayList<Employee> employeesArray = new ArrayList<>();

        // Full time employee object
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Ashton", "123-657-7878", 70000);
        employeesArray.add(fullTimeEmployee);

        // Part time employee object
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Andrew", "465-768-9123", 16.5, 22);
        employeesArray.add(partTimeEmployee);

        // Contractor object
        Contractor contractor = new Contractor("Sam", "478-768-5694", 3500);
        employeesArray.add(contractor);

        // Seasonal employee object
        SeasonalEmployee seasonalEmployee = new SeasonalEmployee("Eden", "764-093-1255", 18.75, 45, "Winter", 1200);
        employeesArray.add(seasonalEmployee);


        // For loop to iterate over objects listed in array to calculate and display info
        System.out.println("--Employee Array--");
        for (Employee employee : employeesArray) {
            employee.displayInfo();
            employee.calculatePay();
            System.out.println("\n********************");
        }
    }
}