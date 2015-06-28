package Starter;

import java.util.Scanner;

public class KidsInCandyStore_Part2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int price = getInteger("Price of a bag please?", s);

		if (price > 0) {
			int money = getInteger("How much money do you have?", s);

			if (money > 0) {
				int numBags = (money / price);

				System.out
						.printf("If price is %sp and you have %sp you will be able to buy %s bags",
								price, money, numBags);
			}
			else if (money == 0) // no pocket money
			{
				System.out.println("Come back with your pocket money!");
			}
			else // money is < 0
			{
				System.out
						.println("Money must be a non-negative numeric value");
			}
		}
		else if (price == 0) // free
		{
			System.out.println("They are free take loads!!");
		}
		else // price is less than 0
		{
			System.out.println("Price must be a non-negative numeric value");
		}
	}

	static int getInteger(String message, Scanner s) {

		System.out.println(message);
		return s.nextInt();
	}

}
