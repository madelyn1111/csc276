
public abstract class Employee {
    protected String name;
    protected String SSN;

    // Constructor
    public Employee(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    // Default constructor
    public Employee(){
        name = " ";
        SSN = " ";
    }

    // abstract method to be overridden
    public abstract void calculatePay();

    // Concrete method
    public void displayInfo(){
        System.out.println("Employee's name: " + name);
    }

    // Setters and Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSSN() {
        return SSN;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}
