package persondetails;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonDetailsMain {
	
	public static final String JSONfileLocation = "/Users/Administrator/Desktop";
	
	public static boolean isRunning = true;

	public static ArrayList<PersonDetails> pList = new ArrayList<>();
	
	public static String[] menuChoices = {"Please Choose an option by number: \n", "1. Add User Details", "2. Display all User Details", "3. Display all Male Users", "4. Display all Female Users", "5. Display All Users Over 18", "6. Display All Users with a certain surname", "7. Display a user with a certain surname", "8. Delete a user with a certain NI number", "9. Save", "10. Quit"};
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		PersonDetails p = new PersonDetails();
		
		p.forename = "Alex";
		p.surname = "R";
		p.gender = "Male";
		p.ni = "AB123456C";
		p.age = 30;
		
		pList.add(p);
		
		readArrayListFromJSON();
		
		
		do {
			try {
				run();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		} while (isRunning);
		
		
		
		
		
	}
	
	private static void displayAllUsers() {
		for (PersonDetails personDetails : pList) {
			personDetails.displayUserDetails();
		}
		
		run();
	}
	
	private static void displayMenuChoices() {
		System.out.println();
		for (int i = 0; i < menuChoices.length; i++) {
			System.out.println( menuChoices[i] );
		}
		
	}
	
	
	private static void displaySurnameUsers(Scanner s) {
		for (PersonDetails p : pList) {
			if (p.getSurname().contains(s.next())) {
				p.displayUserDetails();
			}
		}

		run();
	}
	
	public static void run() {
		
		
		displayMenuChoices();
		int choice = in.nextInt();
		switch ( choice ) {
			case 1:
				addUser();
				break;
			case 2:
				displayAllUsers();
				break;
			case 3:
				displayMaleUsers();
				break;
			case 4:
				displayFemaleUsers();
				break;
			case 5:
				displayOver18Users();
				break;
			case 6:
				displaySurnameUsers(in);
				break;
			case 7:
				displayUserWithSpecificNI(in);
				break;
			case 8:
				deleteUserWithSpecificSurname(in);
				break;
			case 9:
				writeArrayListToJSON();
				break;
			case 10:
				quit();
				break;
			default:
				displayAllUsers();
				break;
		}
	}

	private static void displayOver18Users() {
		for (PersonDetails p : pList) {
			if (p.getAge() >= 18 ) {
				p.displayUserDetails();
			}
		}
		
		run();
	}

	private static void displayFemaleUsers() {
		for (PersonDetails p : pList) {
			if (!p.isMale()) {
				p.displayUserDetails();
			}
		}

		run();
	}

	private static void displayMaleUsers() {
		for (PersonDetails p : pList) {
			if (p.isMale()) {
				p.displayUserDetails();
			}
		}
		run();
	}

	private static void displayUserWithSpecificNI(Scanner s) {
		for (PersonDetails p : pList) {
			if (p.getSurname().contains(s.next())) {
				p.displayUserDetails();
			}
		}
		run();
	}

	private static void quit() {
		isRunning = false;
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		in.close();
		System.exit(0);
		
	}

	private static boolean deleteUserWithSpecificSurname(Scanner s) {
		System.out.println("Please provide a NINO to delete the user with");
		String surname = s.next();
		System.out.println("Searching: " + surname );
		PersonDetails[] pListArray = pList.toArray( new PersonDetails[ pList.size() ] );
		for ( int i = 0; i < pListArray.length ; i++ ) {
			if( pListArray[i].getSurname().contains( surname ) ){
				pList.remove(i);
				return true;
			} else {
				return false;
			}
		}
		
		run();
		return false;
	}
	
	private static void addUser() {
		PersonDetails pD = new PersonDetails();
		System.out.println("Please Provide Forename: ");
		pD.setForename(in.next());
		System.out.println("Please Provide Surname: ");
		pD.setSurname(in.next());
		System.out.println("Please Provide Age: ");
		pD.setAge(setValidAge(in));
		System.out.println("Please Provide Gender: ");
		pD.setGender(setValidGender(in));
		System.out.println("Please Provide National Insurance Number: ");
		pD.setNi(setValidNi(in));
		
		pList.add(pD);

		run();
	}

	
	
	public static int setValidAge(Scanner s){
		int age = s.nextInt();
		if ( !(age < 130 && age >= 0) ){
			System.out.println("Invalid age input. please try again.");
			setValidAge(s);
		} 
		return age;
	}
	
	public static String setValidGender(Scanner s){
		String gender = s.next();
		if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
			System.out.println("Invalid gender input. please input a valid gender as Male or Female" );
			setValidAge(in);
		} 
		return gender;
		
	}
	

	public static String setValidNi(Scanner s){
		String nino = s.next();
		if ( nino.length() != 9 ) {
			System.out.println("NINO must have a length of 9. Please input valid NINO");
			setValidNi(s);
		}
		return nino;
		
	}
	
	public static boolean writeArrayListToJSON(){
		return false;
	}
	
	private static void readArrayListFromJSON() {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("hi.txt"));
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	

}
