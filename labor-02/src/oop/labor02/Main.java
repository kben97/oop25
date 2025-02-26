package oop.labor02;

import oop.labor02.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("BT218113883");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        account1.deposit(500);
        System.out.println(account1.getBalance());
        account1.deposit(-200);
        System.out.println(account1.getBalance());
        if(!account1.withdraw(600)) {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
        else {
            System.out.println("Withdrawal successful.");
        }
        if(!account1.withdraw(200)) {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
        else {
            System.out.println("Withdrawal successful.");
        }
        System.out.println(account1.getBalance());
    }
}
