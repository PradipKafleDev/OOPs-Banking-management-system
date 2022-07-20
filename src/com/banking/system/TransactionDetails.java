package com.banking.system;

import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {
    public static List<Transaction> transactionList = new LinkedList<>();

    public static void addTransaction(Transaction t){
        transactionList.add(t);
    }

    public static void showMiniStatement(int accountNumber){
        System.out.println("Mini statement for account number: "+ accountNumber);
        System.out.println();
        for(Transaction t: transactionList){
            if(t.getAccountNumber()==accountNumber){
                System.out.println(t.getTransactionNumber()+ "-"+t.getTransactionType()+"-"+t.getTransactionAmount()
                +"-"+t.getBalanceAfterTransaction());

            }
        }
    }

}
