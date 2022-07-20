package com.banking.system;

public class InSufficientBalanceException extends Throwable {
    public String toString(){
        return "Balance is not sufficient";

    }
}
