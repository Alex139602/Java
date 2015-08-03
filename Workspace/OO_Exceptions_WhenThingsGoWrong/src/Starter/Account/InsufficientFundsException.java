package Starter.Account;

public class InsufficientFundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public Account acc;
	public double amt;
	
	public InsufficientFundsException(Account ac, double amount) {
		this.acc  = ac;
		this.amt = amount;
	}
	
} // end of class
