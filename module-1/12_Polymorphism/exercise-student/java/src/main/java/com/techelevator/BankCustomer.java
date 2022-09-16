package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[0]);
    }

    public void addAccount(Accountable newAccount){
        if (accounts==null){
           accounts = new ArrayList<>();
        }

        accounts.add(newAccount);

    }

    public boolean isVip(){
        int remaining=0;
        for(Accountable item: accounts){
            remaining+= item.getBalance();
        }
        if (remaining>=25000){
            return true;
        }else{
            return false;
        }
    }
}
