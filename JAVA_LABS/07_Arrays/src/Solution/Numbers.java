package Solution;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		// Create and initialise an array of 8 ints

		int[] myNumbers = new int[] { 1, 3, 5, 7, 2, 4, 6, 8 };
		// Invoke the PrintNumbers method (after writing it!)

		printNumbers(myNumbers);

		// Ask the user to enter a number (and ensure that it is numeric)
		// Invoke your NumberFinder method and check
		// the return value from it to see if the number was found
		// printing out an appropriate message
		System.out.println("Enter the number you'd like to search for: ");
		Scanner s = new Scanner(System.in);
		int searchNum = s.nextInt();

		int result = numberFinder(myNumbers, searchNum);
		if (result != -1) {
			System.out.printf("Number %d found at position %d", searchNum,
					result + 1);
		}
		else {
			System.out.printf("Number %d not found in list", searchNum);
		}

	}

	public static void printNumbers(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println();
	}

	public static int numberFinder(int[] numbers, int numToFind) {

		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == numToFind) {
				return index;
			}
		}
		return -1;
	}

}
