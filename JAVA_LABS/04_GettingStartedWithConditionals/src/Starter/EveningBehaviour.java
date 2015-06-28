package Starter;

public class EveningBehaviour {
	static boolean summerTime = true;
	static boolean sunnyEvening = true;

	public static void main(String[] args) {

	}

	public static boolean isSummerTime() {
		return summerTime;
	}

	public static boolean isSunnyEvening() {
		return sunnyEvening;
	}

	public static void eat(String where) {
		System.out.printf("Eating %s\n", where);
	}

	public static void doGardening() {
		System.out.println("Doing gardening");
	}

	public static void doPaperWork() {
		System.out.println("Doing paperwork");
	}

	public static void takeShower() {
		System.out.println("Taking shower");
	}

	public static void readPaperinSummerHouse() {
		System.out.println("Reading paper in summerhouse");
	}

	public static void readBookInBed() {
		System.out.println("Reading book in bed");
	}

}
