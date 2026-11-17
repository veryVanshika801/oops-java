
import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter details of Account 1:");

        System.out.print("Enter Account Number: ");
        int n1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal1 = sc.nextDouble();

        BankAccount b1 = new BankAccount(n1, name1, bal1);

        
        System.out.println("\nEnter details of Account 2:");

        System.out.print("Enter Account Number: ");
        int n2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal2 = sc.nextDouble();

        BankAccount b2 = new BankAccount(n2, name2, bal2);

        
        System.out.println("\n----- Account 1 -----");

        System.out.print("Enter deposit amount: ");
        double d1 = sc.nextDouble();
        b1.deposit(d1);

        System.out.print("Enter withdrawal amount: ");
        double w1 = sc.nextDouble();
        b1.withdraw(w1);

        b1.checkBalance();
        b1.displayDetails();

       
        System.out.println("\n----- Account 2 -----");

        System.out.print("Enter deposit amount: ");
        double d2 = sc.nextDouble();
        b2.deposit(d2);

        System.out.print("Enter withdrawal amount: ");
        double w2 = sc.nextDouble();
        b2.withdraw(w2);

        b2.checkBalance();
        b2.displayDetails();

        sc.close();
    }
}
