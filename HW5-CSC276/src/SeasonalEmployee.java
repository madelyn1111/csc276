public class SeasonalEmployee extends PartTimeEmployee{
    public String season;
    public double seasonalBonus;

    // Constructor
    public SeasonalEmployee(String name, String SSN, double hourlyRate, double hoursWorked, String season, double seasonalBonus){
        super(name, SSN, hourlyRate, hoursWorked);
        this.season = season;
        this.seasonalBonus = seasonalBonus;
    }

    // Default Constructor
    public SeasonalEmployee(){
        super();
        season = "";
        seasonalBonus = 0.0;
    }

    @Override
    public void calculatePay(){
        System.out.printf("Hourly Wage: $%.2f, Hours Worked: %.2f, Seasonal Bonus: $%.2f", hourlyRate, hoursWorked, seasonalBonus);
        System.out.printf("\nPay: $%.2f", ((hourlyRate * hoursWorked) + seasonalBonus));
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("*Seasonal Employee - " + season + "*");
    }

    // Setters and Getters
    public String getSeason(){
        return season;
    }
    public void setSeason(String season){
        this.season = season;
    }
    public double getSeasonalBonus() {
        return seasonalBonus;
    }
    public void setSeasonalBonus(double seasonalBonus) {
        this.seasonalBonus = seasonalBonus;
    }
}
