package Solution;

public class LuhnAlgorithm {

	public static void main(String[] args) {
		boolean numberValid = luhnCalculation(args[0]);
		String result = (numberValid) ? "Valid CC Number" : "Invalid CC Number";
		System.out.println(result);
	}

	private static boolean luhnCalculation(String ccNo) {
		boolean isValid;
		// Replace any spaces with Empty String
		String textWithNoSpaces = ccNo.replaceAll(" ", "");

		// Check it is 16 chars long
		if (textWithNoSpaces.length() != 16) {
			System.out.println("Credit Card number must be 16 digits long");
			return isValid = false;
		}

		// we got here so it is a 16 digit number
		// convert it to a 16 char array
		char[] nums = textWithNoSpaces.toCharArray();

		// initialise running check digit total
		int runningTotal = 0;

		// loop thru 16 times
		for (int i = 0; i < nums.length; i++) {
			// calculate an int version of this digit as a char will implicitly
			// convert to int
			int digit = nums[i] - '0';

			// if 1st or 3rd or 5th digit of number
			// (i being even 0/2/4 etc)
			if (i % 2 == 0) {
				// double
				digit *= 2;
				// if gt 9 subtract 9
				if (digit > 9) {
					digit -= 9;
				}

			}
			// always add to runningTotal
			// if it was 2nd / 4th / 6th number etc then added unaltered
			runningTotal += digit;
		}

		// see if it is divisible by 10
		isValid = (runningTotal % 10 == 0);

		// returns true only when it is
		return isValid;
	}

}
