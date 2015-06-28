package Solution;

import java.util.Scanner;

public class EnumPractice {

	public static void main(String[] args) {

		HolidayDestination hd = getHolidayDestination();
		processHoliday(hd);
		
	}

	

	private static HolidayDestination getHolidayDestination() {
		System.out.println("Choose a holiday destination");
		// display descriptive values with an incremental count
		// e.g 1 - Africa
		//     2 - Asia
		int count = 0;
		for (HolidayDestination hd : HolidayDestination.values()) {
			System.out.printf("%d - %s\n", ++count, hd.toString());
		}
		Scanner s = new Scanner(System.in);
		// catch the typed choice
		int choice = s.nextInt();

		int maxChoices = HolidayDestination.values().length;
		// if not in range assume Other
		if (choice <= 0 || choice > maxChoices) {
			System.out.println("Assuming ... Other");
			return HolidayDestination.Other;
		}
		return HolidayDestination.values()[choice - 1];
	}

	private static void processHoliday(HolidayDestination hd) {
		switch (hd) {
		case Africa:
			System.out.println("Safari, and see the big 5");
			break;
		case Asia:
			System.out.println("Try Beijings Forbidden City");
			break;
		case NorthAmerica:
			System.out.println("Take the Rocky Mountaineer");
			break;
		case Europe:
			System.out.println("The flight will be shorter!");
			break;
		case India:
			System.out.println("See the Taj Mahal");
			break;
		case SouthAmerica:
			System.out.println("Machu Picchu is recommended");
			break;
		case Australia:
			System.out.println("Don't miss the Great Barrier Reef");
			break;
		default:
			System.out.println("Must be Penguins or Polar Bears then");
			break;
		}
		// System.out.println("Must be Penguins or Polar Bears then");
		// System.out.println("The flight will be shorter!");
		// System.out.println("Safari, and see the big 5");
		// System.out.println("Machu Picchu is recommended");
		// System.out.println("Take the Rocky Mountaineer");
		// System.out.println("Don't miss the Great Barrier Reef");
		// System.out.println("Try Beijings Forbidden City");

	}
	
	

	

}
