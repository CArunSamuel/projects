package com.arun.bankmanagement;

public class Account {
    String holderName ;
    int accountNumber ;
    double balance ;

    void diplayAccount(){
        System.out.println("Holder: " + holderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }


    
}
