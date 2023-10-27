package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double balance = 100.30;
        double minBalance = 2.50;
        String name = "Harry Potter";

        CurrentAccount testAccount = new CurrentAccount(balance, minBalance, name);

        try {
            System.out.println(testAccount.getBalance());
            System.out.println(testAccount.getMinimumBalance());
            System.out.println(testAccount.getBalance() - testAccount.getMinimumBalance());
            System.out.println(testAccount.getMaxWithdrawAmount());
            System.out.println(testAccount.withdraw(40.30));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
