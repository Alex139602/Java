package Solution.Finance;

public class Account {
	private String holder;
	private double balance;
	private String accNo;

	private static int nxtAccNo;

	public double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public String getAccNo() {
		return accNo;
	}

	private void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	private void setHolder(String holder) {
		this.holder = holder;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	private static double overdraftLimit = 500;

	public Account(String name, double balance) {
		setHolder(name);
		setBalance(balance);
		setAccNo(String.format("SA-%04d", getNxtAccNo()));
	}

	public Account(String name) {
		this(name, 0);

	}

	public static int getNxtAccNo() {
		return ++nxtAccNo;
	}



	public String getDetails() {
		return String.format("%s\t%s\t%.2f", getAccNo(), getHolder(),
				getBalance());
	}

	public double getTotalAvailableFunds() {
		return getBalance() + Account.getOverdraftLimit();
	}

	public void deposit(double amt) {
		setBalance(getBalance() + amt);
	}

	public boolean withdraw(double amt) {
		boolean result = false;
		if (amt <= getBalance() + Account.getOverdraftLimit()) {
			setBalance(getBalance() - amt);

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

	public static double getOverdraftLimit() {
		return overdraftLimit;
	}

	public static void setOverdraftLimit(double overdraftLimit) {
		if (overdraftLimit >= 0) {
			Account.overdraftLimit = overdraftLimit;
		}
	}
}
