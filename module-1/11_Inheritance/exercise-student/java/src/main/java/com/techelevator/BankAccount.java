package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private BigDecimal balance;


    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=BigDecimal.valueOf(0);
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=BigDecimal.valueOf(balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance.intValue();
    }

    public int deposit(int amountToDeposit){
        //balance+=amountToDeposit;
        balance=balance.add(BigDecimal.valueOf(amountToDeposit));
        return balance.intValue();
    }

    public int withdraw(int amountToWithdraw){
        //balance-=amountToWithdraw;
        balance=balance.subtract(BigDecimal.valueOf(amountToWithdraw));
        return balance.intValue();

    }


}
