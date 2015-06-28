package Solution.Persons;

import java.util.*;

public class PersonTest {

	private static String[] testNames = { "Holland", "Turner", "Powell",
			"Vicious", "Lyndon", "Spears", "William", "Wire", "Groul", "Love",
			"Jett", "Lopez" };

	private static int[] testAges = { 36, 53, 51, 21, 41, 19, 
									   26, 30, 29, 34, 42, 32 };

	public static void main(String[] args) {

		// Declare and create 2 ArrayDeque<E>
		// one will be used as a Queue and one as a Stack

		ArrayDeque<String> names = new ArrayDeque<>();
		ArrayDeque<Integer> ages = new ArrayDeque<>();

		// Fill them from the testNames/ testAges arrays
		for (int i = 0; i < testNames.length; i++) {
			names.add(testNames[i]);//will act as Queue when 'remove'd
			ages.push(testAges[i]); // will act as stack when 'pop'ped
		}

		// Define and create a ArrayList<E> with an
		// initial capacity of ten objects.
		ArrayList<Person> people = new ArrayList<Person>(10);

		// Fill the collection with new Person objects. Use a 'for' loop.
		// Each time you create a new Person object, you’ll need to
		// specify a name and age to the constructor.
		// You will get these from the 2 ArrayDeque's respectively
		for (int i = 0; i < testNames.length; i++) {
			people.add(new Person(names.remove(), ages.pop()));
		}

		// Print original contents of array
		System.out.println("\nThe original list of people is:\n");
		peopleWriter(people);

		// Add yourself to be the sixth person in the list
		people.add(5, new Person("Tutor", 27));

		System.out.println("\nThe list of people with me inserted is:\n");
		peopleWriter(people);

		// Use get and/or set to print the name and increment
		// the age of the 6th person
		System.out.println("\n6th person is..");
		Person p = people.get(5);
		System.out.println(p.getName());
		p.setAge(28);

		System.out.println("\nThe list of people after my birthday is:\n");
		peopleWriter(people);
	}

	private static void peopleWriter(ArrayList<Person> persons) {
		for (Person p : persons) {
			System.out.println(p.getDetails());
		}
	}

}
