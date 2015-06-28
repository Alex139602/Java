package Solution;

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

		if (year % 4 != 0)
			return false; // not divisible by 4

		if (year % 100 != 0)
			return true; // is divisble by 4 but not 100

		return (year % 400 == 0); // divisible by 4 and 100 and 400 then 'true'

	}

	static boolean isLeapYearAltV1(int year) {

		boolean divBy4, notDivBy100, divBy400;

		divBy4 = (year % 4 == 0);
		notDivBy100 = (year % 100 != 0);
		divBy400 = (year % 400 == 0);

		return divBy4 && (divBy400 || notDivBy100);

	}

	static boolean isLeapYearAltV2(int year) {

		if (year % 4 == 0)
			if (year % 100 != 0 || year % 400 == 0)
				return true;

		return false;

	}

	static boolean isLeapYearAltV3(int year) {

		// not like this!!

		return year % 4 != 0 ? false : year % 100 != 0 ? true
				: year % 400 == 0 ? true : false;

	}

	static boolean isLeapYearAltV4(int year) {

		if (year % 4 != 0) {
			return false;
		}
		else {
			if (year % 100 != 0) {
				return true;
			}
			else {
				if (year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
		}

	}

}
