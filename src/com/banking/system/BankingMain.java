package com.banking.system;

public class BankingMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101,"Pradip",15000);
        BankAccount b2 = new BankAccount(103,"Santosh",25000);

        b1.deposit(2000);
        b1.deposit(500);
        b1.deposit(300);
        b1.withdraw(200);
        b1.withdraw(100);

        System.out.println("--------------------");
        TransactionDetails.showMiniStatement(101);
    }
}
