package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       IAccount Danielsaccount = new StandardAccount(123, -100);
       Danielsaccount.Deposit(100);
        System.out.println(Danielsaccount.GetCurrentBalance());
        System.out.println(Danielsaccount.Withdraw(500));
       System.out.println(Danielsaccount.GetCurrentBalance());
        }
}
