package Solution.NaturalSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonTest {


	private static int[] ages = { 36, 53, 51, 21, 41, 19 };
	private static String[] names = 
		  { "Holland", "Turner", "Powell", 
		    "Vicious", "Lyndon", "Spears" };
	
	private static ArrayList<Integer> ageList
	                                  = new ArrayList<>();
	private static ArrayList<String> nameList
	                                  = new ArrayList<>();	

	private static ArrayList<Person> people;

	public static void main(String[] args) {
		
		
		for (String n : names) { nameList.add(n);}
		for (int a : ages) { ageList.add(a);}

		people = new ArrayList<>(nameList.size());
		
		for (int i = 0; i < nameList.size(); i++) {
			people.add(new Person(nameList.get(i), ageList.get(i)));
		}
		
		System.out.println("\nThe original list of people is:\n");
		printPeople();
		
		Collections.sort(people); 
		// by age based on implementation of Comparable<E>
		System.out.println("\nThe sorted list of people by AGE is:\n");
		printPeople();

	}

	private static void printPeople() {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}
