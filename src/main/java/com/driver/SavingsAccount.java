package com.driver;

public class SavingsAccount extends BankAccount {
    private double rate;
    private double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name, balance, 0);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > maxWithdrawalLimit) {
            throw new Exception("Maximum Withdraw Limit Exceeded");
        }

        if (amount > getBalance()) {
            throw new Exception("Insufficient Balance");
        }

        double balance = amount;
    }

    public double getSimpleInterest(int years) {
        double interest = getBalance() * rate * years;
        return getBalance() + interest;
    }

    public double getCompoundInterest(int times, int years) {
        double principal = getBalance();
        for (int i = 0; i < years; i++) {
            principal *= (1 + rate / times);
        }
        return principal;
    }

    public double getInterestRate() {
        return rate;
    }
}
