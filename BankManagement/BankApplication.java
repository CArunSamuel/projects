package com.arun.bankmanagement;

public class BankApplication {
    
    public static void main(String[] args) {
        
        Account account1 = new Account("Arun", 101, 5000);
        Account account2 = new Account("sam", 102, 15000);

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
