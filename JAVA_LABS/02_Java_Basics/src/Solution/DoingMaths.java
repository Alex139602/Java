package Solution;

public class DoingMaths {

	public static void main(String[] args) {
		// Carry out the tasks below

		int number = 5;
		System.out.println("Initial Value: " + number);

		// Task 1
		// - double it using the '*' operator
		// - now double it again using the '*=' operator
		number = number * 2;
		number *= 2;
		System.out.println("\n1. After doubling it twice: " + number);

		// Task 2
		// - add 3 to it using the '+' operator
		// - now add 3 to it using the '+=' operator
		number = number + 3;
		number += 3;
		System.out.println("\n2. After adding 3 twice: " + number);
	
		
		// Task 3 - subtract 12 from it using an appropriate 'compound' operator
		number -= 12;
		System.out.println("\n3. After subtracting 12: " + number);

		// Task 4 - divide the number (ought to be 14 now) by 3
		// what do you think the answer is
		number = number / 3;
		System.out.println("\n4. After dividing by 3: " + number);

		// Task 5 write 4 different statements that all do the same thing
		// namely 'add 1 to the number'
		number = number + 1;
		number += 1;
		number++;
		++number;
		System.out.println("\n5. After adding 1 four times: " + number);

		// Task 6 decrement by 1 the value of number
		number--;
		System.out.println("\n6. After decrementing once: " + number);

		// Task 7 put the remainder when dividing by 3 into 'remainder'
		int remainder = 0;
		remainder = number % 3;
		System.out.println("\n7. Remainder when dividing by 3 is :" + remainder);

		// Task 8 - after uncommenting the System.out.println(..) below
		// decide what it will print
		int a = 2, b = 3, c = 5;
		double d1, d2, d3, d4;

		d1 = a + b * c / 2;
		d2 = (a + b * c) / 2;
		d3 = (a + b) * c / 2;
		d4 = (a + b) * (c / 2);
		System.out.println("\n8. Values: " + d1 + " : " + d2 + " : " 
		                                   + d3 + " : " + d4);
		// Type your answer here--> 9.0 : 8.0 : 12.0 : 10.0

		// Task 9
		int p, q;
		p = 10;
		q = 10;
		p += q++;
		// Decide what the next line will print
		System.out.println("\n9. Result is: " + (p + q)); // Answer-->

		// Task 10
		// Make the following statement compile
		double d7 = 4.3, d8 = 34.7;
		int truncatedSum = (int) (d7 + d8);
		System.out.println("\n10. Sum is " + truncatedSum);

		// Task 11
		System.out.println("\n11.");
		// Decide what the following 4 lines will print
		// The 4th one might surprise you
		System.out.println("fred" + 3 + 4); // Answer-->
		System.out.println(3 + 4 + "fred"); // Answer-->
		System.out.println("" + 3 + 4); // Answer-->
		System.out.println(3 + ' ' + 4); // Answer-->

		// When you have time ...
		// Change the code of 'Task 8' to ensure floating point
		// arithmetic is performed

	}

}
