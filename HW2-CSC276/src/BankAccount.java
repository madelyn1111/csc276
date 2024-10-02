

public class BankAccount {
    // Variables
    private String accountNum;
    private double bankBalance;

    private double interest;
    // Instance constant
    private final double INTEREST_RATE = 0.03;
    private final int DURATION = 2;


    // Calculations for interest
    public double calcInterest() {
        interest = bankBalance * INTEREST_RATE * DURATION;
        return interest;
    }
    // Method for updating balance
    public void updateBalance() {
        this.bankBalance += this.calcInterest();
    }
    // Method to display account info
    public void displayAccount(){
        System.out.println("Account Number: "+ accountNum);
        System.out.printf("Balance: $%.2f%n", bankBalance);
        System.out.printf("Interest earned: $%.2f%n", interest);
        System.out.printf("Duration: %d year(s)", DURATION);

    }

    // Setters and getters
    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(String theAccountNum) {
        accountNum = theAccountNum;
    }
    public double getBankBalance() {
        return bankBalance;
    }
    public void setBankBalance(double theBankBalance) {
        bankBalance = theBankBalance;
    }
    public int getDuration() {
        return DURATION;
    }

    public double getInterest() {
        return interest;
    }


    // Static method to convert currency
    public static double convertCur(double fAmout, double fEx){
        return (fAmout * fEx);
    }
}
