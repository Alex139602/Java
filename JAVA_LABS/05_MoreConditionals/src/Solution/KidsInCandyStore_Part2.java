package Solution;

import java.util.Scanner;

public class KidsInCandyStore_Part2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double price = getDouble("Price of a bag please?", s);

		if (price < 0) {
			System.out.println("Price must be a non-negative numeric value");
			return;
		}
		if (price == 0) { // free
			System.out.println("They are free take loads!!");
			return;
		}
		// price is gt 0
		double money = getDouble("How much money do you have?", s);

		if (money < 0) {
			System.out.println("Money must be a non-negative numeric value");
			return;
		}
		if (money == 0) { // no pocket money
			System.out.println("Money must be a non-negative numeric value");
			return;
		}
		
		int numBags = (int)(money / price);
		
		
		double change = money - numBags * price;
		

		System.out.printf("If price is £%.2f and you have £%.2f you will be able to purchase %d bag%s and will have £%.2f left over",
		        price, money, numBags,(numBags==1)?"":"s", change );
	}

	static double getDouble(String message, Scanner s) {

		System.out.println(message);
		return s.nextDouble();
	}

}
