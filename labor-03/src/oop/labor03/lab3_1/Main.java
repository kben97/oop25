package oop.labor03.lab3_1;

import oop.labor03.lab3_1.BankAccount;

import oop.labor03.lab3_1.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer("Kantor","Benedek");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP8148949"));
        System.out.println(customer1);
        customer1.getAccount().deposit(500);
        System.out.println(customer1.toString());

    }

}
