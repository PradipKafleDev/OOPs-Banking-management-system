package com.banking.system;

public class Transaction {
    private int transactionNumber;
    private int accountNumber;
    private int transactionAmount;
    private String transactionType;
    private int balanceAfterTransaction;

    public Transaction(int transactionNumber, int accountNumber, int transactionAmount, String transactionType, int balanceAfterTransaction) {
       super();

        this.transactionNumber = transactionNumber;
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }



    public Transaction(){
        super();
    }






    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    public void setBalanceAfterTransaction(int balanceAfterTransaction) {
        this.balanceAfterTransaction = balanceAfterTransaction;
    }






}
