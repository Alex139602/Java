package Starter;

public class Account
{
    private double balance;
    private String holder;

    public Account(double balance, String holder)
    {
        this.balance = balance;
        this.holder = holder;
    }
    
    public double getBalance()
    {
        return balance;
    }

    public String getHolder()
    {
        return holder; 
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

}
