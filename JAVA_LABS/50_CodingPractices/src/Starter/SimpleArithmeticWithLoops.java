package Starter;

public class SimpleArithmeticWithLoops {

	public static void main(String[] args) {

		System.out.println("\n*** Start of Multiply Tests ***");
		multiplyTests();

		System.out.println("\n*** Start of Divide Tests ***");
		divideTests();

		System.out.println("\n*** Start of Remainder Tests ***");
		remainderTests();

		System.out.println("\n*** Start of Power Tests ***");
		powerTests();

		System.out.println("\n*** Start of Negative Tests ***");
		negativeTests();

	}

	static int multiply(int num1, int num2) {
		return 0;
	}

	static int divide(int num1, int num2) {
		return 0;
	}

	static int remainder(int num1, int num2) {
		return 0;
	}

	static int power(int num1, int num2) {

		return 0;

	}

	// Methods full of tests
	static void multiplyTests() {

		int result;

		result = multiply(12, 5);
		System.out.println("\nMultiply 12 by 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12 * 5);

	}

	static void divideTests() {

	}

	static void remainderTests() {

	}

	static void powerTests() {

	}

	static void negativeTests() {

	}

}
