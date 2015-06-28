package Solution.Finance;

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
		return String.format("%s\t%s\t%.2f\n", accNo, holder, balance);
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

	public static boolean transfer(Account from, Account to, double amt) {
		boolean result = false;

		if (from.withdraw(amt)) {
			to.deposit(amt);
			result = true;
		}
		System.out.printf("Transfer Successful: %s\n", result ? "YES" : "NO");
		return result;
	}
}
