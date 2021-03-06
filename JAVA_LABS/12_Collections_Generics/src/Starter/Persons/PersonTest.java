package Starter.Persons;

import java.util.*;

public class PersonTest {
	
	private static String[] testNames = 
		{ "Holland", "Turner", "Powell", "Vicious", "Lyndon", "Spears", 
		  "William", "Wire", "Groul", "Love", "Jett", "Lopez" };
	
	private static int[] testAges = { 36, 53, 51, 21, 41, 19, 
									   26, 30, 29, 34, 42, 32 };
	
	public static void main(String[] args) {
		
		// Declare and create 2 ArrayDeque<E>
		// one will be used as a Queue and one as a Stack
		
		ArrayDeque<String> names = new ArrayDeque<String>(); // queue uses add(), remove() (FIFO)
		ArrayDeque<Integer> ages = new ArrayDeque<Integer>(); // stack uses push(), pop() (LIFO)
		
		// Fill them from the testNames/ testAges arrays
		
		for (String name : testNames) {
			names.add(name);
		}
		
		for (Integer age : testAges) {
			ages.push(age);
		}
		
		//System.out.println(names.toString());
		//System.out.println(ages.toString());
		// Define and create a ArrayList<E> with an
		// initial capacity of ten objects.
		ArrayList<Person> people = new ArrayList<Person>(10);
		for ( String name : testNames ) {
			Person p = new Person(names.remove(), ages.pop());
			people.add(p);
		}
		
		//System.out.println(people.toString());
		
		// Fill the collection with new Person objects. Use a 'for' loop.
		// Each time you create a new Person object, you�ll need to
		// specify a name and age to the constructor.
		// You will get these from the 2 ArrayDeque's respectively
		
		
		// Print original contents of array
		System.out.println("\nThe original list of people is:\n");
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println(people.toString());
		
		// Add yourself to be the sixth person in the list
		people.add(5, new Person("Alex", 19));
		
		System.out.println("\nThe list of people with me inserted is:\n");
		
		System.out.println(people.toString());
		// Use get and/or set to print the name and increment
		// the age of the 6th person
		System.out.println("\n6th person is..");
		
		Object[] prs = people.toArray();
		System.out.println(prs[6]);
		
		System.out.println("\nThe list of people after my birthday is:\n");
		people.set(6, people.set(5, new Person(people.get(5).getName(), people.get(0).getAge() )));
		
		System.out.println(prs[6]);
		
		System.out.println(people.get(0).getAge());

		System.out.println(people.get(5).getAge());
		for (Person person : people) {
			if ( (person.getAge() > people.get(5).getAge()) ) {
				System.out.println(person.toString());
			}
		}
	}

}
