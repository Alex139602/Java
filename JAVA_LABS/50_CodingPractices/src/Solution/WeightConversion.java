package Solution;

import java.util.Scanner;

public class WeightConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		convertInputToStonesPounds(s);

		convertKgsToStonesPounds(s);
		convertStonesPoundsToKgs(s);

	}

	private static void convertInputToStonesPounds(Scanner s) {
		int pounds = getInteger("Enter Pounds please", s);

		int stones = pounds / 14;
		pounds = pounds % 14;

		System.out.printf("%d stones %d pounds\n", stones, pounds);
	}

	private static void convertKgsToStonesPounds(Scanner s) {
		double conversionFactorKgsToLbs = 2.20462;

		int kgs = getInteger("Enter kgs please", s);
		int pounds = (int) (kgs * conversionFactorKgsToLbs);
		int stones = pounds / 14;
		pounds = pounds % 14;

		System.out.printf("%d stones %d pounds\n", stones, pounds);
	}

	private static void convertStonesPoundsToKgs(Scanner s) {
		double conversionFactorKgsToLbs = 2.20462;

		int stones, pounds;
		stones = getInteger("Enter Stones please", s);
		pounds = getInteger("Enter Pounds please", s);

		pounds += stones * 14;

		double kgs = pounds / conversionFactorKgsToLbs;
		System.out.printf("%d Kgs\n", Math.round(kgs));
	}

	private static int getInteger(String message, Scanner s) {
		System.out.println(message);
		return s.nextInt();

	}
}
