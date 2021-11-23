package com.company;

public class BasicAccount extends StandardAccount {

    protected double withdrawallimit;

    public BasicAccount(int accountNumber, double Withdrawallimit) {
        super(accountNumber, Withdrawallimit);
        this.creditLimit = 0;
        if(Withdrawallimit > 0){
            this.withdrawallimit = Withdrawallimit;
        }
        else
        {
        this.withdrawallimit = 0;
        }


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