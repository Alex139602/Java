package Starter.Account;

public class Program {

	public static void main(String[] args) {
		Account ac1, ac2;

		ac1 = new Account(100.0, "Joe Smith", "A1234");
		ac2 = new Account(-200.0, "Jane Doe", "A9876");

		System.out.println(ac1.getDetails());
		System.out.println(ac2.getDetails());

	}

}
