package Solution.NINumbers;

public class NINumber {

	// Field to store a NI Number
	// An invalid number will be blank
	private String nationalInsuranceNumber;

	// Return NI Number
	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	private String formattedNINumber;

	// Return formatted NI Number
	public String getFormattedNINumber() {
		return formattedNINumber;
	}

	// field to store whether a NI number is valid
	private boolean isValidNumber;

	public boolean isValid() {
		return isValidNumber;
	}

	// / Constructor for a National Insurance Number
	public NINumber(String number) {
		// remove any spaces from the number,
		// convert it to uppercase and validate it
		number = number.replace(" ", "").toUpperCase();
		validate(number);

		// Store number and a formatted version of it if it is valid
		// otherwise make it blank

		if (isValid()) {
			nationalInsuranceNumber = number;
			formattedNINumber = String.format("%s %s %s %s %s",
					number.substring(0, 2), number.substring(2, 4),
					number.substring(4, 6), number.substring(6, 8),
					number.substring(8, 9));
		}
		else {
			nationalInsuranceNumber = "";
			formattedNINumber = "";
		}
	}

	// Method to perform all validations of the NI Number
	private void validate(String number) {
		
		if (number.length() != 9) {
			isValidNumber = false;
			return;
		}
		// Other validation you could do here
		// - First two characters are letters
		// - Next six characters are numbers
		// - Last character is a letter
		// - Letters not used
		char[] chars = number.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			// 1st 2 chars and last
			if (i == 0 || i == 1 || i == 8) {
				if (!Character.isUpperCase(chars[i])) {
					isValidNumber = false;
					return;
				}
			}
			else if (i >= 2 && i <= 7 ) {
				if (!Character.isDigit(chars[i])) {
					isValidNumber = false;
					return;
				}
			}
		}
		isValidNumber = true;
	}

	// Method to tell whether the number is temporary
	// (start with the letters TF)
	public boolean isTemporaryNumber() {
		return (isValid() && nationalInsuranceNumber.startsWith("TF"));
	}

	// Method to tell whether the number is issued for a
	// Crown Dependency
	public boolean isCrownDependency() {
		return isValid() && 
				(nationalInsuranceNumber.startsWith("JY")
			  || nationalInsuranceNumber.startsWith("MA") 
			  || nationalInsuranceNumber.startsWith("GY"));

	}

	// / Property to return the name of the Crown Dependency
	// / Should only be accessed if the number is identified as a Crown
	// Dependency

	public CrownDependency getCrownDependency() {

		if (!isValid())
			return CrownDependency.None;
			//throw new RuntimeException("Not a valid number");

		if (nationalInsuranceNumber.startsWith("JY"))
			return CrownDependency.Jersey;
		else if (nationalInsuranceNumber.startsWith("MA"))
			return CrownDependency.IsleOfMan;
		else if (nationalInsuranceNumber.startsWith("GY"))
			return CrownDependency.Guernsey;
		else
			return CrownDependency.None;
			//throw new RuntimeException("Not a Crown Dependency");

	}

	// Method to return the signing on day of week
	// This is determined by the last two digits of the number
	public DayOfWeek getSigningOnDay() {

		// check if the number is valid
		if (!isValid())
			return DayOfWeek.None;
			//throw new RuntimeException("Invalid National Insurance Number");

		// extract the last two digits as a String and convert it
		String lastTwoDigits = nationalInsuranceNumber.substring(6, 8);
		int digits = Integer.parseInt(lastTwoDigits);

		if (digits < 21)
			return DayOfWeek.Monday;
		else if (digits < 41)
			return DayOfWeek.Tuesday;
		else if (digits < 61)
			return DayOfWeek.Wednesday;
		else if (digits < 81)
			return DayOfWeek.Thursday;
		else
			return DayOfWeek.Friday;
		
	}

}
