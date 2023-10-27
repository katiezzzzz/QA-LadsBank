package com.qa;

public class AppTest
{
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE MOJO DOJO CASA LADS BANK");
        currentAccountStuff();
        savingsAccountStuff();
    }

    public static void currentAccountStuff() {
        CurrentAccount currentAccount1 = new CurrentAccount(100, 30, "Ginny Weasley");
    }

    public static void savingsAccountStuff() {
        SavingsAccount savingsAccount1 = new SavingsAccount(30, 20, "Harry Potter", 4.1);
    }
}
