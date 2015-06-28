package Solution;

import java.util.Scanner;

public class CouncilTaxCalculation {

	public static void main(String[] args) {
		// Notes - calc month 2 payment by averaging and rounding then 
		// do 9* and subtraction to get 1st payment
		System.out.println("What is the total council tax?");
		
		Scanner s = new Scanner(System.in);
		double councilTax = s.nextDouble();

		double firstPayment, subSeqPayment;
		subSeqPayment = calculateSubSequentPayments(councilTax);
		firstPayment = councilTax - (subSeqPayment * 9);
		
		
		System.out.printf("First payment of %.2f\n", firstPayment);
		System.out.printf("Followed by 9 payments of %.2f\n", subSeqPayment);
		System.out.printf("Total %.2f\n", firstPayment
				+ (9 * subSeqPayment));
	}
	private static double calculateSubSequentPayments(double councilTax) {
		double average = councilTax / 10;
		return Math.round(average);
	}
}
