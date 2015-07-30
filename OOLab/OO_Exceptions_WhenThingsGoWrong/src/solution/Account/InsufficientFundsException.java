package Solution.Account;

public class InsufficientFundsException extends RuntimeException {

	public final Account acc;
	public final double amt;

	public InsufficientFundsException(Account ac, double amount) {
		acc = ac;
		amt = amount;
	}
}
