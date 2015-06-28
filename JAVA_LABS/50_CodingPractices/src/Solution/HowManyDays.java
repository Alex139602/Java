package Solution;

import java.util.Calendar;

import java.util.GregorianCalendar;


public class HowManyDays {

	public static void main(String[] args) {
		daysSoFarThisYear();
		
		System.out.println();
		daysAliveYearOfBirth();
		
		System.out.println();
		daysAliveInterveningYears();
	}

	private static void daysSoFarThisYear() {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Calendar now = Calendar.getInstance();

		int day = now.get(Calendar.DAY_OF_MONTH);
		// Month starts at 0 in a calendar so add 1 to get real month
		int realMonth = now.get(Calendar.MONTH) + 1;

		int numDaysSoFarThisYear = 0;
		// calc days to beginning of this month
		// so if month is 4 (April) the loop reads 0-2 which is Jan-Mar
		for (int i = 0; i < realMonth - 1; i++) {
			numDaysSoFarThisYear += daysInMonth[i];
		}
		// add days of this month
		numDaysSoFarThisYear += day;
		// add one if a leap year and we have reached March
		if (isLeapYear(now.get(Calendar.YEAR)) && realMonth >= 3) {
			numDaysSoFarThisYear++;
		}
		System.out.println("Days so far this year");
		System.out.printf("Using Calendar: %d\n", now.get(Calendar.DAY_OF_YEAR));
		System.out.printf("My calculation: %d\n", numDaysSoFarThisYear);
	}

	private static void daysAliveYearOfBirth() {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// this date is Feb 29th 1956!! why does month start at 0?
		GregorianCalendar dobCal = new GregorianCalendar(1956, 1, 29);
		int dayBorn, monthBorn, yearBorn;
		dayBorn = dobCal.get(Calendar.DAY_OF_MONTH);
		// again need to add 1 to get real month
		monthBorn = dobCal.get(Calendar.MONTH) + 1;
		yearBorn = dobCal.get(Calendar.YEAR);
		// code to calculate daysAlive in year of birth using the array above
		int calcDaysAliveYearOfBirth = 0;
		// include days of all months after birth month
		// ie if born in Feb (month 2) add all days of months 3-12 
		// which are of course (2-11 of array)
		for (int i = monthBorn; i < daysInMonth.length; i++) {
			calcDaysAliveYearOfBirth += daysInMonth[i];
		}
		// calculate days alive in actual birthmonth
		// i.e if born on 30th of a month with 31 days it is 31 - 30 + 1 = 2
		// being 30th - 31st inclusive (2 days)
		int daysAliveInBirthMonth = daysInMonth[monthBorn - 1] - dayBorn + 1;
		calcDaysAliveYearOfBirth += daysAliveInBirthMonth;
		// was birthday in a leap year and before March 1st
		// if so add 1 day
		
		if (isLeapYear(yearBorn) && monthBorn < 3) {
			calcDaysAliveYearOfBirth++;
		}

		// code to check calculated value against using DayOfYear property
		int numofDaysInYearOfBirth = isLeapYear(yearBorn) ? 366 : 365;
		int daysAliveThatYear = numofDaysInYearOfBirth
				- dobCal.get(Calendar.DAY_OF_YEAR) + 1;

		System.out.println("Days alive in the year I was born");
		System.out.printf("Using calendar: %d\n", daysAliveThatYear);
		System.out.printf("My calculation: %d\n", calcDaysAliveYearOfBirth);

	}

	private static void daysAliveInterveningYears() {
		int daysAliveInterveningYears = 0;
		int birthYear = 1995, todayYear = 2014;
		for (int year = birthYear + 1; year < todayYear; year++) {
			daysAliveInterveningYears += 365;
			if (isLeapYear(year)) {
				daysAliveInterveningYears++;
			}
		}
		System.out.println("Days alive in all intervening years");
		System.out.printf("%d\n", daysAliveInterveningYears);

	}

	private static boolean isLeapYear(int year) {

		boolean divBy4, divBy100, divBy400;

		divBy4   = year % 4 == 0;
		divBy100 = year % 100 == 0;
		divBy400 = year % 400 == 0;

		boolean isLeapYear = (divBy4 && !divBy100) || divBy400;

		return isLeapYear;
	}

}
