package Solution.Finance;

public class Program {

	public static void main(String[] args) {
		Account ac1, ac2;
		ac1 = new Account("Fred", 100);
		ac2 = new Account("Susy");
		ac1.deposit(100);
		ac2.withdraw(300);
		Account.transfer(ac1, ac2, 50);
		System.out.println(ac1.getDetails());
		System.out.println(ac2.getDetails());

		// Challenge 1
		System.out.println("\nChallenge 1");
		Account[] accs = { ac1, ac2 };
		processAccounts(accs);
		System.out.printf("%s\t%.2f\n", ac1.getHolder(), ac1.getBalance());
		System.out.printf("%s\t%.2f\n", ac2.getHolder(), ac2.getBalance());
		System.out.println();

		// Challenge 2
		System.out.println("\nChallenge 2");
		String[] names = { "Ann", "Anne", "Annie", "Anneka", "Annabel" };
		Account[] studentAccs = new Account[names.length];

		for (int i = 0; i < studentAccs.length; i++) {
			studentAccs[i] = new Account(names[i],
					(int) (Math.random() * 100) + 1);
		}
		for (Account a : studentAccs) {
			System.out.println(a.getDetails());
		}
		for (int i = 0; i < studentAccs.length; i++) {
			int transferAmt = studentAccs[i].getHolder().length();
			if (i < studentAccs.length - 1) {
				
				Account.transfer(studentAccs[i], studentAccs[i + 1],
						                               transferAmt);
			}
			else {
				Account.transfer(studentAccs[i], studentAccs[0],
						                               transferAmt);
			}
		}
		for (Account a : studentAccs) {
			System.out.println(a.getDetails());
		}
	}

	private static void processAccounts(Account[] accs) {
		for (Account a : accs) {
			a.deposit(10);
		}
	}

}
