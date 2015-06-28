package Starter;

public class LeapYearAlgorithm {

	public static void main(String[] args) {
		// implement isLeapYear so that the output from this 4 line
		// test produces False, False, True, True
		System.out.printf("\n1900 - %s", isLeapYear(1900));
		System.out.printf("\n2014 - %s", isLeapYear(2014));

		System.out.printf("\n2012 - %s", isLeapYear(2012));
		System.out.printf("\n2000 - %s", isLeapYear(2000));

	}

	static boolean isLeapYear(int year) {

		return true; // just to make it compile

	}

}
