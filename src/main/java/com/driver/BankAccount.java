package com.driver;

public class BankAccount {
    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        if (digits <= 0 || digits > 9) {
            throw new IllegalArgumentException("Invalid number of digits");
        }

        if (sum < 0 || sum > 9 * digits) {
            throw new Exception("Account Number cannot be generated");
        }

        StringBuilder accountNumber = new StringBuilder();
        while (digits > 0) {
            int digit = Math.min(9, sum);
            accountNumber.append(digit);
            sum -= digit;
            digits--;
        }

        return accountNumber.toString();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance - amount < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
