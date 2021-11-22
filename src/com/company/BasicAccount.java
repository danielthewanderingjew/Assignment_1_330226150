package com.company;

public class BasicAccount extends StandardAccount {

    protected double withdrawallimit;

    public BasicAccount(int accountNumber, double Withdrawallimit) {
        super(accountNumber, Withdrawallimit);
        this.creditLimit = 0;
        this.withdrawallimit = Withdrawallimit;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > withdrawallimit) {
            balance = balance - withdrawallimit;
            return withdrawallimit;
        }
        else
        {
            balance = balance - amount;
            return amount;
        }
    }
}