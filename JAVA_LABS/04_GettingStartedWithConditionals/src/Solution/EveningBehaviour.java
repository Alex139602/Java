package Solution;

public class EveningBehaviour {
	static boolean summerTime = true;
	static boolean sunnyEvening = true;
	static boolean isWeekend = false;

	public static void main(String[] args) {

		if (isWeekend()) {
			doActivity("- having a lie in");
			doActivity("- watch sport on TV");
			doActivity("- go out for a meal");
		} else {
			if (isSummerTime()) {
				takeShower();
				if (isSunnyEvening()) {
					eat("outside");
				} else {
					eat("inside");
				}
				doActivity("gardening");
			} else {
				eat("inside");
				if (isSunnyEvening()) {
					read("paper", "summerhouse");
				}
				doActivity("paperWork");
				takeShower();
			}
			read("book", "bed");
		}
		doActivity("- cleaning teeth");
	}

	public static boolean isSummerTime() {
		return summerTime;
	}

	public static boolean isSunnyEvening() {
		return sunnyEvening;
	}

	public static boolean isWeekend() {
		return isWeekend;
	}

	public static void eat(String where) {
		System.out.printf("Eating %s\n", where);

	}

	// public static void doGardening() {
	// System.out.println("Doing gardening");
	// }
	//
	// public static void doPaperWork() {
	// System.out.println("Doing paperwork");
	// }

	public static void doActivity(String activity) {
		System.out.printf("Doing %s\n", activity);
	}

	public static void takeShower() {
		System.out.println("Taking shower");
	}

//	public static void readPaperinSummerHouse() {
//		System.out.println("Reading paper in summerhouse");
//	}
//
//	public static void readBookInBed() {
//		System.out.println("Reading book in bed");
//	}

	public static void read(String what, String where) {
		System.out.printf("Reading %s in %s\n", what, where);

	}

}
