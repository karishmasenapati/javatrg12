import java.util.Scanner;

class BankAccount {
    private static int accountNumberCounter = 1000;

    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int numberOfTransactions;
    public BankAccount(String name, String address, String accountType, double balance) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.numberOfTransactions = 0;
        this.accountNumberCounter++;
    }

    public void displayInfo() {
        System.out.println("\nDepositor Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: BA" + accountNumberCounter);
        System.out.println("Balance: $" + balance);
    }
    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public void changeAddress(String newAddress) {
        address = newAddress;
        numberOfTransactions++;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numberOfDepositors = scanner.nextInt();
        scanner.nextLine(); 
        BankAccount[] accounts = new BankAccount[numberOfDepositors];

        
        for (int i = 0; i < numberOfDepositors; i++) {
            System.out.println("\nEnter information for Depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Account Type: ");
            String accountType = scanner.nextLine();
            System.out.print("Initial Balance: $");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            accounts[i] = new BankAccount(name, address, accountType, initialBalance);
        }
        for (int i = 0; i < numberOfDepositors; i++) {
            accounts[i].displayInfo();
            System.out.print("\nEnter the amount to deposit for Depositor " + (i + 1) + ": $");
            double depositAmount = scanner.nextDouble();
            accounts[i].deposit(depositAmount);
            accounts[i].displayInfo();
            System.out.print("\nEnter the amount to withdraw for Depositor " + (i + 1) + ": $");
            double withdrawAmount = scanner.nextDouble();
            accounts[i].withdraw(withdrawAmount);
            accounts[i].displayInfo();
            scanner.nextLine(); 
            System.out.print("\nEnter the new address for Depositor " + (i + 1) + ": ");
            String newAddress = scanner.nextLine();
            accounts[i].changeAddress(newAddress);
            accounts[i].displayInfo();
        }

        int totalTransactions = 0;
        for (int i = 0; i < numberOfDepositors; i++) {
            totalTransactions += accounts[i].getNumberOfTransactions();
        }
        System.out.println("\nTotal Number of Transactions: " + totalTransactions);

        scanner.close();
    }
}
