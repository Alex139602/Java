package Starter;

public class MethodCallingPractice {

	public static void main(String[] args) {
		// We want you to practice calling 7 methods hidden away in an
		// 'area' at the bottom of the class.
		// You don't need to look at them to see what the methods are
		// called as we are going to tell you, well give you a clue anyway.

		// Each method is a common girls name, one starts with 'a', one with
		// 'b' etc up to letter 'g' so you should be able to find
		// them in the intellisense list easily, one of the 7 is overloaded.

		// We want you to call each in turn according to the following rules
		// (these are repeated down below, so you don't need to remember them)
		// If the method takes 1 parameter pass a literal value e.g(3) or
		// ("Jane")
		// If it takes 2 parameters pass a literal then a variable e.g(3,x)
		// If it takes 3 parameters pass a literal, a variable,
		// and an expression an example might be methodName(3, x, x + 3);

		// If the method is overloaded (Intellisense will show 2 versions)
		// then you must invoke each version according to the rules above
		// If the method is not void (Intellisense will tell you!)
		// then you simply MUST catch what is returned and DISPLAY it.
		// Final rule, you must call at least one of the methods passing
		// something 'narrower' than what is expected allowing a safe widening
		// conversion to happen.

		// Each method will display on the Console a String (a sentence)
		// which uses the parameters you passed to that method.

		// Here are some predefined but uninitialised variables to save you a
		// few seconds, ADD OTHERS if you want.
		int i;
		long l;
		float f;
		double d;
		char c;
		String s;
		boolean b;

		// start calling 'alice', 'beatrice' etc running your code regularly
		// feel free to write any lines of code you need before each call
		// to initialise one of the variables defined above for example

		// Example statement--> alice();
		
		// remember
		// 1st param - a literal
		// 2nd param - a variable
		// 3rd param an expression
		// catch and display any values returned
		// decide where the widening conversion happens
		// call both versions of the 1 method of the 7 that is overloaded
		// one method returns true/false, think of an appropriate display

	}

	private static void whenYouHaveTime() {
		
		// This project has a class called Countries.
		// It contains 5 methods that each match a Country Name.
		// Call a few of them and display what they return
		// But can you guess what question are these values the answer to?
		System.out.println("When you have time...");

		// Example
		//System.out.println("\nChile - " + Countries.Chile());
		
		System.out.println("\nChile - ");
		System.out.println("\nRussia - ");
		System.out.println("\nMongolia - ");
		System.out.println("\nZimbabwe - ");
		System.out.println("\nFinland - ");
	}

	private static void alice() {
		System.out.printf("\nI am %s and I know nothing", "Alice");
	}

	private static void beatrice(int age) {
		System.out.printf("\nI am %s and I am %s years old", "Beatrice", age);
	}

	private static void catherine(double height, long numPets) {
		System.out
				.printf("\nI am %s and I am %s metres tall and will have %s pets if one was to die",
						"Catherine", height, numPets - 1);
	}

	private static void dashmi(String jobTitle, int numOfBuses, float miles) {
		System.out
				.printf("\nI am %s working as a %s %s miles from home. I use %s buses each day",
						"Dashmi", jobTitle, miles, numOfBuses);
	}

	private static String eleanor(String bestFriend, int numSisters) {
		return String.format(
				"\n%s best friend is called %s and she has %s sisters",
				"Eleanor's", bestFriend, numSisters);
	}

	private static String eleanor(String countryOfBirth, String bestFriend,int numSisters) {

		return String
				.format("\n%s best friend is called %s.\nShe has %s sisters.\nShe was born in %s.",
						"Eleanor's", bestFriend, numSisters, countryOfBirth);
	}

	private static boolean fiona(int currentAge) {
		return 66 > currentAge;
	}

	private static String georgina(char upperCase, String surname) {
		return "\nThe next Prime Minister is Miss " + upperCase + "." + surname;
	}

}
