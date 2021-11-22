package com.company;

public class PremiumAccount extends StandardAccount {

    public PremiumAccount(int accountNumber) {
        super(accountNumber,accountNumber);
    }
    @Override
    public double Withdraw(double amount) {
        balance = balance - amount;
        return amount;
        }
    }