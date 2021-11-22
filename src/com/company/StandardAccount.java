package com.company;

public class StandardAccount implements IAccount{

    protected int accountNumber;
    protected double creditLimit;
    protected double balance;

    public StandardAccount(int AccountNumber, double CreditLimit)
    {
        this.accountNumber = AccountNumber;
        if (CreditLimit > 0)
        {
            this.creditLimit = 0;
        }
        else
        {
            this.creditLimit = CreditLimit;
        }
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        balance = balance+amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > (balance - creditLimit))
        {
            double withdrawalAmount = balance - creditLimit;
            balance = creditLimit;
            return withdrawalAmount;
        }
        else
        {
            balance = balance - amount;
            return amount;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}
