
public class BankAccountTest {
    public static void main(String[] args) {

        // Adding first bank account object
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountNum("100");
        bankAccount1.setBankBalance(1000);

        // Adding second bank account object
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setAccountNum("200");
        bankAccount2.setBankBalance(1500);

        // Depositing and withdrawing for the bank accounts
        bankAccount1.setBankBalance(bankAccount1.getBankBalance() + 300);
        bankAccount2.setBankBalance(bankAccount2.getBankBalance() - 400);

        // Variables for currency conversion
        double account1Con = BankAccount.convertCur(150,1.18);
        double account2Con = BankAccount.convertCur(140,1.11);

        // Adding conversion calc to bank account
        bankAccount1.setBankBalance(bankAccount1.getBankBalance() + account1Con);
        bankAccount2.setBankBalance(bankAccount2.getBankBalance() + account2Con);

        // Updating balance with interest
        bankAccount1.updateBalance();
        bankAccount2.updateBalance();

        // Output for the bank accounts
        System.out.println("Account one information");
        System.out.println("-----------------------");
        bankAccount1.displayAccount();

        System.out.println("\nAccount two information");
        System.out.println("-----------------------");
        bankAccount2.displayAccount();
        System.out.println("\n####################");

    }
}