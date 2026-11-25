package com.arun.bankmanagement;

public class Account {
    String holderName ;
    int accountNumber ;
    double balance ;

    

    public Account(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    void diplayAccount(){
        System.out.println("Holder: " + holderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }


    
}
