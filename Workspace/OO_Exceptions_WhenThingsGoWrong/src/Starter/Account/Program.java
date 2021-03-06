package Starter.Account;

public class Program {

	public static void main(String[] args) {
		Account ac1 = null, ac2 = null;
		try {
			ac1 = new Account(1100.0, "Joe Smith", "A1234");
			ac2 = new Account(200.0, "Jane Doe", "A9876");
			System.out.println(ac1.getDetails());
			System.out.println(ac2.getDetails());
			
			/*ac1.deposit(ac2.getBalance() + 100);
			ac2.withdraw(ac2.getBalance() + 100);
			*/
			
			Account.transfer(300, ac2, ac1);
			System.out.println(ac1.getDetails());
			System.out.println(ac2.getDetails());
		} catch( IllegalArgumentException e){
			System.out.println( "\n" + e.getMessage());
		} catch ( InsufficientFundsException ee){
			System.out.printf("Not enough cash to withdraw %7.2f" );
		}
		
	}

}
