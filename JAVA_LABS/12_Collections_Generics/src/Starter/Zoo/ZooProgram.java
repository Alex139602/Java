package Starter.Zoo;

import java.util.*;

public class ZooProgram {
	
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
		
	} // end of main
	
	public static Integer normalCount;
	
	private static HashMap<String, Integer> animalMap = new HashMap<>();
	
	private static String[] originalAnimals = { "Zebra", "Lion", "Buffalo" };
	
	private static String[] newAnimals = { "Zebra", "Gazelle", "Buffalo", "Zebra" };
	
	private static void addAnimals(String[] animals) {
		// iterate over the array passing each in turn 
		for (String type : animals) {
			animalMap.put(type, normalCount);
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
		
		String[] keys = new String[]{"Hi", "Hello"};
		for (String key : keys ) {
			
			System.out.println("Animal: " + key + " -- " + "Count: " + animalMap.get(key));
			
		}
		
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
	
} // end of class
