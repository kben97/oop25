package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS=10;
    private int numAccounts;
    private BankAccount accounts[]=new BankAccount[MAX_ACCOUNTS];

    public Customer(String firstName,String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        numAccounts=0;
    }

    public void addAccount(BankAccount account)
    {
        if(numAccounts<MAX_ACCOUNTS) {
            accounts[numAccounts]=account;
            numAccounts++;
        }
        else {
            System.out.println("Account limit reached. Cannot create more accounts.");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i=0;i<numAccounts;i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)==true) {
                return accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
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
        for(int i=0;i<numAccounts;i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)==true) {
                accounts[i]=null;
                ok=0;
                for(int j=i+1;j<numAccounts;j++) {
                    accounts[j-1]=accounts[j];
                }
                numAccounts--;
                break;
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
        for(int i=0;i<numAccounts;++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }

}
