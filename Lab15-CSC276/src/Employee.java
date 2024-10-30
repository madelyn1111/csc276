
public class Employee {
    protected String name;
    protected int id;

    // Default constructor
    public Employee() {
        this.name = "n/a";
        this.id = 0;
    }

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // method to display traits
    public void displayDetails(){
        System.out.println("Name: " + name + " ID: " + id);

    }

    // Method to calculate pay
    public double calculatePay(){
        return 0.0;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
