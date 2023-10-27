package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a Bank Account
            BankAccount bankAccount = new BankAccount("John Doe", 10000, 1000);

            // Creating a Current Account
            CurrentAccount currentAccount = new CurrentAccount("Alice Smith", 15000, "ABCDE123");
            currentAccount.validateLicenseId();

            // Creating a Savings Account
            SavingsAccount savingsAccount = new SavingsAccount("Bob Johnson", 8000, 2000, 0.05);
            savingsAccount.deposit(2000);
            savingsAccount.withdraw(1500);

            // Creating a Student Account
            StudentAccount studentAccount = new StudentAccount("Eve Brown", 2000, "XYZ University");
            studentAccount.deposit(500);

            // Printing account information
            System.out.println("Bank Account Details:");
            System.out.println("Name: " + bankAccount.getName());
            System.out.println("Balance: " + bankAccount.getBalance());

            System.out.println("\nCurrent Account Details:");
            System.out.println("Name: " + currentAccount.getName());
            System.out.println("Balance: " + currentAccount.getBalance());
            System.out.println("Trade License ID: " + currentAccount.getTradeLicenseId());

            System.out.println("\nSavings Account Details:");
            System.out.println("Name: " + savingsAccount.getName());
            System.out.println("Balance: " + savingsAccount.getBalance());
            System.out.println("Interest Rate: " + savingsAccount.getInterestRate());

            System.out.println("\nStudent Account Details:");
            System.out.println("Name: " + studentAccount.getName());
            System.out.println("Balance: " + studentAccount.getBalance());
            System.out.println("Institution: " + studentAccount.getInstitutionName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
