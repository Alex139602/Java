package Solution;

import java.util.Scanner;

public class DoingLunch {

	public static void main(String[] args) {
		System.out.println("What main dish would you like?");
		Scanner s = new Scanner(System.in);
		String mainCourse = s.nextLine();

		// System.out.println("How many roast potatoes?");
		// int roastCount = s.nextInt();
		// replaced by -->
		int roastCount = getInteger("How many roast potatoes?", s);

		// System.out.println("How many brussel sprouts?");
		// int brusselCount = s.nextInt();
		// replaced by -->
		int brusselCount = getInteger("How many brussel sprouts?", s);

		// System.out.println("Hello, your lunch is " + mainCourse);
		// System.out.printf("Hello, your lunch is %s", mainCourse);

		// System.out.printf("Hello, your lunch is %s with %s roast potatoes",

		System.out.printf("Hello, your lunch is %s with %s roast potatoes and %s brussel sprouts",
						mainCourse, roastCount, brusselCount);
		System.out.println();
//		int numberQuarters = (roastCount + 1) * 4;
//		numberQuarters -= brusselCount;
//		numberQuarters = Math.max(numberQuarters, 0);
//		System.out.printf("After gaining one more potato, you will have %s roast quarters left over",
//						numberQuarters);
		System.out.printf("After gaining one more potato, you will have %s roast quarters left over",
				Math.max((roastCount + 1) * 4 - brusselCount, 0));
	}

	private static int getInteger(String message, Scanner s) {
		System.out.println(message);
		return s.nextInt();
	}

}
