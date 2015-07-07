package Starter.Finance;


public class Program {

	public static void main(String[] args) {
		if(Account.overdraftLimit < 0) { 
			System.out.println("Account overdraft = " + Account.overdraftLimit + " WRONG!"); 
		}
		Account ac1, ac2 = null;
		ac1 = new Account("Fred", 100.00);
		ac2 = new Account("Suzy", 150.00);
		Account[] acAr = new Account[]{ac1, ac2};
		
		
		for (int i = 0; i < acAr.length; i++) {
			System.out.println(acAr[i].getDetails());
	
		}

		Account.transfer(ac1, ac2, 210);
		
		for (int i = 0; i < acAr.length; i++) {
			System.out.println(acAr[i].getDetails());
		}
	
	
	} // end of main

} // end of class
