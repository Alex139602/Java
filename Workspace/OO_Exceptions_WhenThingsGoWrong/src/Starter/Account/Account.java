package Starter.Account;

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
		try {
			if ( balance < 0 ) {
				throw new IllegalArgumentException("Negative Value for balance");
			}
			this.balance = balance;
			this.holder = holder;
			this.number = number;
		} catch( IllegalArgumentException exc ){
			System.out.println(exc.getMessage());
		}
	}

	public boolean deposit(double amount) {
		boolean withdrawal = true;
		
		try {
			if (amount < 0 ) {
				withdrawal = false;
				throw new IllegalArgumentException("cant deposit negative amounts, this is the same as withdrawing");
			}
			balance += amount;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return withdrawal;
	}

	public boolean withdraw(double amount) {
		
		boolean result = false;
		
		try{
			if ( amount < 0 ) {
				throw new IllegalArgumentException("Can't withdraw -ve amounts, this is the same as depositing");
			}
			if ( amount > balance ) { 
				throw new InsufficientFundsException(this, amount);
			} else {
				balance -= amount;
				result = true;
			}
			
		} catch (IllegalArgumentException | InsufficientFundsException e){
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public static boolean transfer(double amount, Account from, Account to) {
		
		boolean accountFromBoolean = false;
		boolean accountToBoolean = false;
		
		try {
			
			accountFromBoolean = from.withdraw(amount);
			
			if ( accountFromBoolean ) {
				accountFromBoolean = to.deposit(amount);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			from.audit("Transfer attempt to " + to.number + ". Completion Status: " + accountFromBoolean);
		}
		
		return accountFromBoolean;
	
	}

	public String getDetails() {
		return number + "\t" + holder + "\t" + balance;
	}

	public void audit(String message) {
		System.out.println(number + ": " + message);
	}
	
	public void recieveTransferAudit(String message) {
		System.out.println(number + ": " + message);
	}

} // end of class
