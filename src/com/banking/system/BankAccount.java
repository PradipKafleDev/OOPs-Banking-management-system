package com.banking.system;

import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private int accountBalance;

    public BankAccount(int accountNumber, String customerName, int accountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }
    public BankAccount(){
        super();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(int depositAmount){
        accountBalance+= depositAmount;
        Random r = new Random();

        /*
         After performing deposit we need to store the deposit details in an object
          of a Transaction class and then store that object in some collection
         */

        Transaction t = new Transaction(r.nextInt(),
                accountNumber,depositAmount,"deposit",accountBalance);

        TransactionDetails.addTransaction(t);
        System.out.println("Deposited completed and Transaction stored..");




    }

    public void withdraw(int withdrawAmount){
        if(withdrawAmount> accountBalance){
            try {
                throw new InSufficientBalanceException();
            } catch (InSufficientBalanceException e) {
                e.printStackTrace();
            }
        }
        accountBalance-= withdrawAmount;

        Random r = new Random();
        Transaction t = new Transaction(r.nextInt(),accountNumber
                ,withdrawAmount,"deposit",accountBalance);

        TransactionDetails.addTransaction(t);
        System.out.println("Withdraw completed and Transaction stored..");

    }


}
