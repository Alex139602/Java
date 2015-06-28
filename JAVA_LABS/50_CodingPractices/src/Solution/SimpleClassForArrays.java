package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleClassForArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Prompt user to enter 10 numbers
		System.out.println("Please enter 10 numbers, hit enter after each one");
		// Declare and create an array of 10 integers
		int[] values = new int[10];
		// popluate it
		for (int i = 0; i < 10; i++) {
			values[i] = s.nextInt();
		}
		Arrays.sort(values);
		System.out.println("Here are the input values");
		for (int val : values) {
			System.out.print(val + " ");
		}
		// instantiate worker class
		ArrayInfo ai = new ArrayInfo(values);

		System.out.println("Results");
		System.out.println("-------");
		System.out.printf("Sum = %d\n", ai.getSum());
		System.out.printf("Max = %d\n", ai.getMaximum());
		System.out.printf("Min = %d\n", ai.getMinimum());
		System.out.printf("Ave = %.2f\n", ai.getAverage());

		// Challenge portions
		System.out.printf("Count of uniques = %d\n",ai.getCountOfUniqueNumbers());

		showOdds(ai.getOdds());

		showEvens(ai.getEvens());

		showMostPopular(ai.getMostPopularNumbers());

		showLeastPopular(ai.getLeastPopularNumbers());

		showUniques(ai.getUniques());
	}

	private static void showUniques(int[] uniques) {
		System.out.println("Here are the unique values");
		for (int num : uniques) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	private static void showLeastPopular(int[] leastPop) {
		System.out.println("Here are the least popular numbers");
		for (int num : leastPop) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	private static void showMostPopular(int[] mostpop) {
		System.out.println("Here are the most popular numbers");
		for (int num : mostpop) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	private static void showEvens(int[] evens) {
		System.out.println("Here are the evens");
		if (evens.length == 0) {
			System.out.println("..there were none");
		}
		else {
			for (int num : evens) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	private static void showOdds(int[] odds) {
		System.out.println("Here are the odds");
		if (odds.length == 0) {
			System.out.println("..there were none");
		}
		else {
			for (int num : odds) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

}
