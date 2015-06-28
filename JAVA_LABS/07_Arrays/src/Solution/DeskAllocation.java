package Solution;

public class DeskAllocation {
	public static String[][] deskNames;

	public static String[] names = 
		{ "Amy", "Ben", "Carly", "Danesha", "Evy", "Faroukh", 
		  "Greg", "Heather", "Ivy", "Jaz", "Keith", "Monica",
		  "Nick" };

	public static void main(String[] args) {

		deskNames = new String[3][];
		deskNames[0] = new String[6];
		deskNames[1] = new String[0];
		deskNames[2] = new String[6];

		System.out.println("===============================");
		allocateAllDesks(1);
		displayDeskMapAlt();
		clearTheDesks();
		System.out.println("===============================");

		allocateAllDesks(2);
		displayDeskMap();
		clearTheDesks();
		System.out.println("===============================");

		allocateAllDesks(3);
		displayDeskMap();
		clearTheDesks();
		System.out.println("===============================");

		allocateAllDesks(4);
		displayDeskMap();
		//clearTheDesks();
		System.out.println("===============================");

		System.out.println("Searching for people..");
		searchDesks("Jaz");
		searchDesksAlt("Jaz");

		searchDesks("Nick");
		searchDesksAlt("Nick");
		

	}

	public static void allocateAllDesks(int how) {
		String startWhere = "";
		switch (how) {
		case 1:
			startWhere = "front left";
			break;
		case 2:
			startWhere = "front right";
			break;
		case 3:
			startWhere = "back left";
			break;
		case 4:
			startWhere = "back right";
			break;
		}
		System.out.printf("Allocating desks from %s\n", startWhere);
		switch (how) {
		case 1:
			for (String name : names)
				allocateDeskFromFrontLeft(name);
			break;
		case 2:
			for (String name : names)
				allocateDeskFromFrontRight(name);
			break;
		case 3:
			for (String name : names)
				allocateDeskFromBackLeft(name);
			break;
		case 4:
			for (String name : names)
				allocateDeskFromBackRight(name);
			break;
		}
	}

	public static void allocateDeskFromFrontLeft(String name) {
		boolean deskAssigned = false;
		for (int row = 0; row < deskNames.length; row++) {
			for (int col = 0; col < deskNames[row].length; col++) {
				if (deskNames[row][col] == null) {
					deskNames[row][col] = name;
					//System.out.printf("Row:%d Desk:%d assigned to %s\n",
					//                             row + 1, col + 1, name);
					deskAssigned = true;
					break;
				}
			} // end of a row
			if (deskAssigned) 
				break;
		}   // end of all rows
		if (!deskAssigned) {
			System.out.printf("No desk found for %s\n", name);
		}
	}

	public static void allocateDeskFromFrontRight(String name) {
		boolean deskAssigned = false;
		for (int row = 0; row < deskNames.length; row++) {
			for (int col = deskNames[row].length - 1; col >= 0; col--) {
				if (deskNames[row][col] == null) {
					deskNames[row][col] = name;
					//System.out.printf("Row:%d Desk:%d assigned to %s\n",
					//		 row + 1, col + 1, name);
					deskAssigned = true;
					break;
				}
			} // end of a row
			if (deskAssigned)
				break;
		} // end of all rows
		if (!deskAssigned) {
			System.out.printf("No desk found for %s\n", name);
		}
	}

	public static void allocateDeskFromBackLeft(String name) {
		boolean deskAssigned = false;
		for (int row = deskNames.length - 1; row >= 0; row--) {
			for (int col = 0; col < deskNames[row].length; col++) {
				if (deskNames[row][col] == null) {
					deskNames[row][col] = name;
					//System.out.printf("Row:%d Desk:%d assigned to %s\n",
					//		 row + 1, col + 1, name);
					deskAssigned = true;
					break;
				}
			} // end of a row
			if (deskAssigned)
				break;
		} // end of all rows
		if (!deskAssigned) {
			System.out.printf("No desk found for %s\n", name);
		}
	}

	public static void allocateDeskFromBackRight(String name) {
		boolean deskAssigned = false;
		for (int row = deskNames.length - 1; row >= 0; row--) {
			for (int col = deskNames[row].length - 1; col >= 0; col--) {
				if (deskNames[row][col] == null) {
					deskNames[row][col] = name;
					//System.out.printf("Row:%d Desk:%d assigned to %s\n",
					//		 row + 1, col + 1, name);
					deskAssigned = true;
					break;
				}
			} // end of a row
			if (deskAssigned)
				break;

		} // end of all rows
		if (!deskAssigned) {
			System.out.printf("No desk found for %s\n", name);
		}
	}

	public static void displayDeskMap() {
		System.out.println();
		for (int row = 0; row < deskNames.length; row++) {
			for (int col = 0; col < deskNames[row].length; col++) {
				String nextName = deskNames[row][col];
				if (nextName == null) {
					System.out.print("EMPTY\t");
					// continue;
				}
				else {
					System.out.print(nextName + "\t");
				}
			}
			System.out.println();
		}
	}

	public static void displayDeskMapAlt() {
		System.out.println();
		for (String[] row : deskNames) {
			for (String name : row) {
				System.out.printf("%s\t", name == null ? "EMPTY" : name);
			}
			System.out.println();
		}

	}

	public static void searchDesks(String name) {
		boolean deskFound = false;
		for (int row = 0; row < deskNames.length; row++) {
			for (int col = 0; col < deskNames[row].length; col++) {
				String n = deskNames[row][col];
				if (n != null
						&& n.equals(name)) {
					System.out.printf("%s is located at Row:%d Column:%d\n",
							name, row + 1, col + 1);
					deskFound = true;
					break; // out;
				}
			}
			if (deskFound)
				break;

		} // end of desks
		if (!deskFound) {
			System.out.printf("%s has no desk\n", name);
		}
	}

	public static void searchDesksAlt(String name) {
		boolean deskFound = false;
		for (String[] row : deskNames) {
			for (String nameAtDesk : row) {
				if (nameAtDesk != null && nameAtDesk.equals(name)) {
					System.out.printf("Found %s\n", name);
					deskFound = true;
					break;
				}
			}
		}
		if (!deskFound) {
			System.out.printf("%s has no desk\n", name);
		}
	}

	public static void clearTheDesks() {
		for (int row = 0; row < deskNames.length; row++) {
			for (int col = 0; col < deskNames[row].length; col++) {
				deskNames[row][col] = null;
			}
		}
	}
}
