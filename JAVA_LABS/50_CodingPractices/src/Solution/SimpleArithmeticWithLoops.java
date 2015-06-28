package Solution;

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

		if (num1 == 0 || num2 == 0) {
			return 0;
		}
		// neither parameter is zero
		// declare a boolean to track whether the total will need negating
		boolean resultHasCorrectSign = true;
		if (num1 < 0) {
			// make it the opposite of what it was!. It started as true.
			// so if a negative parameter is found - toggle it
			resultHasCorrectSign = !resultHasCorrectSign;
			num1 = -num1;
		}
		if (num2 < 0) {
			// make it the opposite of what it was!.
			// so if a negative parameter is found - toggle it
			resultHasCorrectSign = !resultHasCorrectSign;
			num2 = -num2;
		}

		// this must be done after potentially changing the sign
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int total = doRepeatedAddition(num1, num2);

		return (resultHasCorrectSign) ? total : -total;
	}

	static int divide(int num1, int num2) {
		if (num1 == 0 || num2 == 0)
			return 0;

		// both params are not zero
		// declare a boolean to track whether the total will need negating
		boolean resultHasCorrectSign = true;
		if (num1 < 0) {
			// make it the opposite of what it was!. It started as true.
			// so if a negative parameter is found - toggle it
			resultHasCorrectSign = !resultHasCorrectSign;
			num1 = -num1;
		}
		if (num2 < 0) {
			// make it the opposite of what it was!.
			// so if a negative parameter is found - toggle it
			resultHasCorrectSign = !resultHasCorrectSign;
			num2 = -num2;
		}

		int count = doRepeatedSubtraction(num1, num2);
		return (resultHasCorrectSign) ? count : -count;
	}

	static int remainder(int num1, int num2) {
		// if numbers are 11 & 4 this is 11 - ((11/4) * 4)
		return num1 - multiply(divide(num1, num2), num2);
	}

	static int power(int num1, int num2) {
		if (num2 == 0)
			return 1;
		if (num1 == 0)
			return 0;
		if (num2 < 0)
			return 0; // cannot do negative powers with ints

		return doRepeatedMultiply(num1, num2);
	}

	static int doRepeatedAddition(int num1, int num2) {
		int total = 0;
		for (int i = 0; i < num1; i++) {
			total += num2;
		}
		return total;
	}

	static int doRepeatedSubtraction(int num1, int num2) {
		int count = 0;
		while (num1 >= num2) {
			num1 -= num2;
			count++;
		}
		return count;
	}

	static int doRepeatedMultiply(int num1, int num2) {
		int result = num1;
		// if 2 * 4 the loop needs to run 3 times only
		// 2..4..8..16
		for (int i = 0; i < num2 - 1; i++) {
			result = multiply(result, num1);
		}
		return result;
	}

	// Methods full of tests
	static void multiplyTests() {
		int result;
		result = multiply(12, 5);

		System.out.println("\nMultiply 12 by 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12 * 5);
		result = multiply(5, 12);
		System.out.println("\nMultiply 5 by 12");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 5 * 12);
		result = multiply(12, 0);
		System.out.println("\nMultiply 12 by 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12 * 0);
		result = multiply(0, 5);
		System.out.println("\nMultiply 0 by 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0 * 5);
	}

	
	static void divideTests() {
		int result;

		result = divide(15, 3);
		System.out.println("\nDivide 15 by 3");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 15 / 3);

		result = divide(15, 0);
		System.out.println("\nDivide 15 by 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0);

		result = divide(0, 15);
		System.out.println("\nDivide 0 by 15");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0 / 15);

		result = divide(15, 15);
		System.out.println("\nDivide 15 by 15");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 15 / 15);

	}

	static void remainderTests() {
		int result;
		result = remainder(12, 5);
		System.out.println("\nRemainder 12 and 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12 % 5);

		result = remainder(12, 0);
		System.out.println("\nRemainder 12 and 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12);

		result = remainder(5, 12);
		System.out.println("\nRemainder 5 and 12");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 5 % 12);

		result = remainder(5, 5);
		System.out.println("\nRemainder 5 and 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 5 % 5);

	}

	static void powerTests() {
		int result;
		result = power(2, 4);
		System.out.println("\nPower 2 to power 4");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", (int) Math.pow(2, 4));

		result = power(2, 0);
		System.out.println("\nPower 2 to power 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", (int) Math.pow(2, 0));

		result = power(0, 2);
		System.out.println("\nPower 0 to power 2");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", (int) Math.pow(0, 2));

	}

	static void negativeTests() {

		int result;
		result = multiply(-2, 4);
		System.out.println("\nMultiply -2 by 4");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -2 * 4);

		result = multiply(2, -4);
		System.out.println("\nMultiply 2 by -4");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 2 * -4);

		result = multiply(-2, 0);
		System.out.println("\nMultiply -2 by 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -2 * 0);

		result = multiply(0, -4);
		System.out.println("\nMultiply 0 by -4");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0 * -4);

		result = divide(-12, 5);
		System.out.println("\nDivide -12 by 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -12 / 5);

		result = divide(12, -5);
		System.out.println("\nDivide 12 by -5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12 / -5);

		result = divide(-12, -5);
		System.out.println("\nDivide -12 by -5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -12 / -5);

		result = remainder(12, -5);
		System.out.println("\nRemainder 12 and - 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 12 % -5);

		result = remainder(2, -5);
		System.out.println("\nRemainder 2 and -5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 2 % -5);

		result = remainder(-12, -5);
		System.out.println("\nRemainder -12 and -5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -12 % -5);

		result = remainder(-2, -5);
		System.out.println("\nRemainder -2 and -5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -2 % -5);

		result = remainder(-12, 5);
		System.out.println("\nRemainder -12 and 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -12 % 5);

		result = remainder(-2, 5);
		System.out.println("\nRemainder -2 % 5");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -2 % 5);

		result = remainder(-3, 0);
		System.out.println("\nRemainder -3 % 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -3);

		result = remainder(0, -3);
		System.out.println("\nRemainder 0 % -3");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0 % -3);

		result = power(2, -4);
		System.out.println("\nPower: 2 to power -4");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0);

		result = power(-2, 3);
		System.out.println("\nPower: -2 to power 3");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", -8);

		result = power(-2, 4);
		System.out.println("\nPower: -2 to power 4");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 16);

		result = power(-2, 0);
		System.out.println("\nPower: -2 to power 0");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 1);

		result = power(0, -2);
		System.out.println("\nPower: 0 to power -2");
		System.out.printf("Actual result is:  %d\n", result);
		System.out.printf("Expected result is:%d\n", 0);
	}

}
