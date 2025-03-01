package oop.labor02;

import oop.labor02.bank.BankAccount;

import oop.labor02.rectangle.Rectangle;

import oop.labor02.dateUtil.DateUtil;

public class Main {
    public static void main(String[] args) {
        //1.
        System.out.println("excercise 1");
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


        //2.
        System.out.println();
        System.out.println("excercise 2");
        Rectangle rectangle1=new Rectangle(12,10);
        System.out.println("length:" + rectangle1.getLength());
        System.out.println("width:" + rectangle1.getWidth());
        System.out.println("area:" + rectangle1.area());
        System.out.println("perimeter:" + rectangle1.perimeter());


        //3.
        System.out.println();
        System.out.println("excercise 3");
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);

    }
}
