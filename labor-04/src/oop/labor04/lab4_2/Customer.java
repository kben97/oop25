package oop.labor04.lab4_2;

import oop.labor04.lab4_2.BankAccount;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void addAccount(BankAccount account)
    {
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount item : accounts) {
            if(item.getAccountNumber().equals(accountNumber)) {
                return item;
            }
        }
        return null;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public void closeAccount(String accountNumber) {
        int ok=1;
        for(BankAccount item : accounts) {
            if(item.getAccountNumber().equals(accountNumber)) {
                ok=0;
                accounts.remove(item);
            }
        }
        if(ok==1) {
            System.out.println("Cannot find account with the given number.");
        }
    }
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(getFirstName() + ' ' + getLastName() + " accounts:" + getNumAccounts() + "\n");
        for(BankAccount item : accounts) {
            result.append("\t" + item + "\n");
        }
        return result.toString();
    }

}
