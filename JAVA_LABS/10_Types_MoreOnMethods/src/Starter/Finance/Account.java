package Starter.Finance;

public class Account {
	private String holder;
	private double balance;
	private String accNo;

	private static int nxtAccNo;

	private static double overdraftLimit = 500;

	public Account(String name, double balance) {
		holder = name;
		this.balance = balance;
		accNo = String.format("SA-%04d", ++nxtAccNo);
	}

	public Account(String name) {
		this(name, 0);

	}

	public String getDetails() {

		return String.format("%s\t%s\t%.2f", accNo, holder, balance);
	}

	public double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public boolean withdraw(double amt) {
		boolean result = false;
		if (amt <= this.balance + Account.overdraftLimit) {
			balance -= amt;
			result = true;
		}
		return result;
	}

	public static boolean transfer(Account accFrom, Account accTo, double amt) {
		boolean result = false;

		if (accFrom.withdraw(amt)) {
			accTo.deposit(amt);
			result = true;
		}
		System.out.printf("Transfer Successful: %s\n", result ? "YES" : "NO");
		return result;
	}

	public double getTotalAvailableFunds() {
		return getBalance() + getOverdraftLimits();
	}
	
	public static double getOverdraftLimits() {
		return overdraftLimit;
	}
	
	public static void setOverdraftLimit(double overdraftLimit) {
		if (overdraftLimit >= 0) {
			Account.overdraftLimit = overdraftLimit;
		}
	}

	
} // end of class
