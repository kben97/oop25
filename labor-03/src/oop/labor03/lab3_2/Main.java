package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import oop.labor03.lab3_2.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer("John","Black");
        System.out.println(customer1);
        customer1.addAccount(new BankAccount("BRD8134698"));
        customer1.addAccount(new BankAccount("BRD24672"));
        customer1.addAccount(new BankAccount("BRD111111"));
        customer1.addAccount(new BankAccount("BRD35353535"));
        customer1.addAccount(new BankAccount("BRD762719"));
        System.out.println(customer1);
        customer1.getAccount("BRD8134698").deposit(220);
        customer1.getAccount("BRD24672").deposit(52);
        customer1.getAccount("BRD111111").deposit(1200);
        customer1.getAccount("BRD35353535").deposit(570);
        customer1.getAccount("BRD762719").deposit(13.5);
        System.out.println(customer1);
        customer1.setLastName("White");
        System.out.println(customer1);
        customer1.closeAccount("bruh");
        customer1.closeAccount("BRD24672");
        System.out.println(customer1);
        customer1.addAccount(new BankAccount("BRD55555555"));
        customer1.addAccount(new BankAccount("BRD2222"));
        customer1.addAccount(new BankAccount("BRD88888"));
        customer1.addAccount(new BankAccount("BRD66666"));
        customer1.addAccount(new BankAccount("BRD3333333333"));
        customer1.addAccount(new BankAccount("BRD12"));
        customer1.addAccount(new BankAccount("BRD1277"));
        System.out.println(customer1);
    }
}
