
public class Contractor extends Employee{
    public double weeklyRate;

    // Constructor
    public Contractor(String name, String SSN, double weeklyRate){
        super(name, SSN);
        this.weeklyRate = weeklyRate;
    }

    // Default Constructor
    public Contractor(){
        super();
        weeklyRate = 0.0;
    }

    @Override
    public void calculatePay() {
        System.out.printf("Weekly Payment: $%.2f", weeklyRate);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("(Contractor)");
    }

    // Setters and Getters
    public double getWeeklyRate(){
        return weeklyRate;
    }
    public void setWeeklyRate(double weeklyRate){
        this.weeklyRate = weeklyRate;
    }
}
