import java.util.Scanner;

public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayDetails() {
        System.out.println(accountNumber + " " + accountHolder + " " + balance);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String accNum = s.next();
        String accHolder = s.next();
        double bal = s.nextDouble();
        BankAccount acc = new BankAccount(accNum, accHolder, bal);
        
        double depAmount = s.nextDouble();
        acc.deposit(depAmount);
        
        acc.displayDetails();
    }
}
