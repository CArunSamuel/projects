package com.arun.bankmanagement;

public class BankApplication {
    
    public static void main(String[] args) {
        
        Account account1 = new Account();
        
        account1.holderName ="Arun";
        account1.accountNumber = 101;
        account1.balance = 5000;

        Account account2 = new Account();
        
        account2.holderName ="sam";
        account2.accountNumber = 102;
        account2.balance = 15000;

        System.out.println();

        account1.diplayAccount();

        System.out.println();
        
        System.out.println("------------------");

        System.out.println();
        
        account2.diplayAccount();

        System.out.println();

        System.out.println("------------------");

    }
    
}
