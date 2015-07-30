package Solution.Account;

public class Program {

	public static void main(String[] args) {
		Account ac1, ac2;

		try {
			ac1 = new Account(100.0, "Joe Smith", "A1234");
			// ac2 = new Account(-200.0m, "Jane Doe", "A9876");
			ac2 = new Account(200.0, "Jane Doe", "A9876");

			Account.transfer(500, ac1, ac2);
			System.out.println(ac1.getDetails());
			System.out.println(ac2.getDetails());

		} catch (IllegalArgumentException exn) {
			System.out.println(exn.getMessage());
		} catch (InsufficientFundsException isfe) {

			// Console.WriteLine("Not enough cash to withdraw " + isfe.Amt +
			// " from Account:"
			// + isfe.Acc.Number + " as " + isfe.Acc.Holder
			// + " has a current balance of only " + isfe.Acc.Balance);
			System.out.printf(
					"Not enough cash to withdraw %7.2f from Account:%s as "
							+ "%s has a current balance of only %7.2f\n", isfe.amt,
					isfe.acc.getNumber(), isfe.acc.getHolder(),
					isfe.acc.getBalance());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
