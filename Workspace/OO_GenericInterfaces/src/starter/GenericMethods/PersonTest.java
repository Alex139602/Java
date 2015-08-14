package starter.GenericMethods;

import java.util.Arrays;

public class PersonTest {

	static String[] names = { "Tom", "Amy", "Zhen", "Jasmine" };
	static int[] ages = { 22, 35, 19, 24 };

	public static void main(String[] args) {
		Person[] people = new Person[4];

		for (int i = 0; i < names.length; i++) {
			people[i] = new Person(names[i], ages[i]);
		}
		System.out.println("\nThe original list of people is:\n");
		print(people);

		// Sort by age based on implementation of Comparable<E>
		
				
		System.out.println("\nThe sorted list of people by AGE is:\n");
		print(people);
		
		// Sort by name based on implementation  of Comparator<E>
		 
											
		System.out.println("\nThe sorted list of people by NAME is:\n");
		print(people);
	}

	private static void print(Person[] people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}
