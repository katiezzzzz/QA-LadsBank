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
    }

    private static void withdrawSavings() {
        double expectedBalance = 500;
        double minBalance = 0;
        String name = "Hermione Granger";

        SavingsAccount myAccount = new SavingsAccount(expectedBalance, minBalance, name);
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
        double expectedBalance = 1000;
        double minBalance = 0;
        String name = "Harry Potter";

        CurrentAccount myAccount = new CurrentAccount(expectedBalance, minBalance, name);
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
