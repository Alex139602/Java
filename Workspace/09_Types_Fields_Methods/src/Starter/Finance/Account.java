package Starter.Finance;

import javax.swing.JOptionPane;

public class Account {

	private String holder;
	private double balance;
	private String accNum;
	private static int nxtAccNum;
	public static double overdraftLimit = 500;
	
	public Account() {
	
	}
	
	public Account(String holder, double balance){
		accNum = String.format("SA-%04d", ++nxtAccNum);
		this.holder = holder;
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public boolean withdraw(double amt) {
		boolean result = false;
		
		if ( amt <= (this.balance + Account.overdraftLimit) ) {
			balance -= amt;
			result = true;
			System.out.println("Withdrew amount: " + amt);
			System.out.println("Transfer Succesful: Yes");
		} else {
			System.out.println("Transfer Succesful: No");
		} 
		
		return result;
	}
	
	public static boolean transfer (Account accFrom, Account accTo, double amt){
		boolean result = false;
		
		if ( accFrom.withdraw(amt) == true ) {
			accTo.deposit(amt);
			result = true;
		}
		return result;
	}
	
	public void setHolder(String holder){
		this.holder = holder;
	}
	
	public void setHolder(double balance){
		this.balance = balance;
	}
	
	public void setAccNum(String accNum){
		this.accNum = accNum;
	}
	
	public String getHolder(){
		return holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getThisAccNum() {
		return this.accNum;
	}
	
	public String getAccNum() {
		return accNum;
	}
	
	public String getDetails() {
		return String.format("%s\t%s\t%.2f\n", accNum, holder, balance);
	}
	
	public double getTotalFundsAvailable(){
		return getBalance() + Account.overdraftLimit;
	}
	
} // end of class
