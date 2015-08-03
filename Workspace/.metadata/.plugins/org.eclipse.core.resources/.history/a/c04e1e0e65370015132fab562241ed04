package Solution.Account;

public class Account {
	private double balance;
	private String holder;
	private String number;

	public double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public String getNumber() {
		return number;
	}
	
	public Account(double balance, String holder, String number) {
		if (balance < 0.0) {
			throw new IllegalArgumentException("Negative balances are not supported");
		}
		this.balance = balance;
		this.holder = holder;
		this.number = number;
	}


	public void withdraw(double amount) {
		if (amount < 0.0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		if (balance < amount) {
			throw new InsufficientFundsException(this, amount);
		}
		balance -= amount;
	}

	public void deposit(double amount) {
		if (amount < 0.0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		balance += amount;
	}

	public static void transfer(double amount, Account from, Account to) {
		boolean result = false;
		
		try {
			from.withdraw(amount);

			to.deposit(amount);

			result = true;
		} finally {
			from.audit("Transfer attempt to " + to.number
					+ ". Completion Status: " + result);
		}
	}

	public String getDetails() {
		return number + " " + holder + " " + balance;
	}

	public void audit(String message) {
		System.out.println(number + ": " + message);
	}

}
