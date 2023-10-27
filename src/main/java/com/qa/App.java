package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to the Lads Bank! (no gals allowed)");
        withdrawCurrent();
        System.out.println("========================================");
        withdrawSavings();
        System.out.println("========================================");
        depositSavings();
    }

    private static void depositSavings() {
        double balance = 800;
        double minBalance = 0;
        String name = "Ron Weasley";
        SavingsAccount myAccount = new SavingsAccount(balance, minBalance, name);
        System.out.println(String.format("%s's current balance: %.2f",
                myAccount.getAccountHolderName(), myAccount.getBalance()));
        try {
            System.out.println(myAccount.deposit(1000));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("%s's new balance: %.2f",
                myAccount.getAccountHolderName(), myAccount.getBalance()));

        try {
            System.out.println(myAccount.deposit(-3));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void withdrawSavings() {
        double balance = 500;
        double minBalance = 0;
        String name = "Hermione Granger";

        SavingsAccount myAccount = new SavingsAccount(balance, minBalance, name);
        System.out.println(String.format("%s's current balance: %.2f",
                myAccount.getAccountHolderName(), myAccount.getBalance()));
        try {
            System.out.println(myAccount.withdraw(50));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("%s's new balance: %.2f",
                myAccount.getAccountHolderName(), myAccount.getBalance()));

        try {
            System.out.println(myAccount.withdraw(-3));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void withdrawCurrent() {
        double balance = 1000;
        double minBalance = 0;
        String name = "Harry Potter";

        CurrentAccount myAccount = new CurrentAccount(balance, minBalance, name);
        System.out.println(String.format("%s's current balance: %.2f",
                myAccount.getAccountHolderName(), myAccount.getBalance()));
        try {
            System.out.println(myAccount.withdraw(50));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("%s's new balance: %.2f",
                myAccount.getAccountHolderName(), myAccount.getBalance()));

        try {
            System.out.println(myAccount.withdraw(-3));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
