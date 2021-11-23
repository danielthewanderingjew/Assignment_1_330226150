package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank implements IBank{
    protected List<IAccount> accountList;

    // constructor
    public Bank() {
        this.accountList = new ArrayList<IAccount>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accountList.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Account Number");

            int thisaccountnumber = myObj.nextInt();

            for (IAccount account: accountList) {
            if (account.GetAccountNumber() == thisaccountnumber) {
                if(account.GetCurrentBalance()>0){
                    accountList.remove(account);
                    }
                else
                {
                   System.out.println("the account is not closed due to debt");
                }
                }
            return;
            }
        }

    @Override
    public List<IAccount> GetAllAccounts() {
        return accountList;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountindebtList = new ArrayList<IAccount>();
        for (IAccount account: accountList) {
            if(account.GetCurrentBalance()<0){
                accountindebtList.add(account);
            }
        }
        return accountindebtList;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountwithmoneyList = new ArrayList<IAccount>();
        for (IAccount account: accountList) {
            if(account.GetCurrentBalance()>balanceAbove){
                accountwithmoneyList.add(account);
            }
        }
        return accountwithmoneyList;
    }
}
