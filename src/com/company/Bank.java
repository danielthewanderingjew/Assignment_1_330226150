package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    @Override
    public void OpenAccount(IAccount account) {

    }

    @Override
    public void CloseAccount(int accountNumber) {

    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return null;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        return null;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        return null;
    }
}
