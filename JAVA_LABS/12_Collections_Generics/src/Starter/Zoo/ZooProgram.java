package Starter.Zoo;

import java.util.*;

public class ZooProgram {

	

	private static String[] originalAnimals 
	    = { "Zebra", "Lion", "Buffalo" };

	private static String[] newAnimals 
	    = { "Zebra", "Gazelle", "Buffalo", "Zebra" };

	public static void main(String[] args) {
		
		

		addAnimals(originalAnimals);

		System.out.println("Original Animal Inventory");
		System.out.println("-------------------------");
		displayAnimalData();

		addAnimals(newAnimals);

		System.out.println("Final Animal Inventory");
		System.out.println("----------------------");
		displayAnimalData();

		displaySortedListOfTypes();
	}

	private static void addAnimals(String[] animals) {
		// iterate over the array passing each in turn 
		for (String type : animals) {
			//??
		}
	}

	private static void addNewOrReplaceExisting(String type) {
		// have we already processed an animal of this type?
		
		// if so increment value and put back
			
		
		// otherwise new sort of animal so make new entry
		
	}

	private static void displayAnimalData() {
		System.out.println("Type\t\tCount");
		System.out.println("----\t\t-----");
		// get the keySet of the map and iterate over it
		// printing the type and the associated value
		
		
		
		
		System.out.println();
	}

	private static void displaySortedListOfTypes() {
		// declare and create list using correct constructor
		
		// sort the collection
		
		System.out.println("\nAnimals sorted by type");
		System.out.println("----------------------");
		// print them out
		
		
		
		
		System.out.println();
	}

}
