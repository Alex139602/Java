package Solution;

import java.util.Scanner;

public class NetPromoterScores {

	public static void main(String[] args) {
		// ask for 11 numbers hitting enter after each
		// any out-or-range numbers tell them to start again and exit program
		// test 2,2,8,8,9,9,9,9,9,9,9

	      int promoters = 0, detractors = 0, respondents = 0;
	      System.out.println("Enter 11 delegate scores in range 0-10");
	      System.out.println("Hit enter after each value");
	      Scanner s = new Scanner(System.in);
	      for (int i = 0; i < 11; i++) {
			
	        int num = s.nextInt();
	        // Calculate whether a detractor, promoter or passive
	        if (num < 0 || num > 10) {
				System.out.println("Invalid entry - start again");
				return;
			}
	        if (num == 9 || num == 10)
	        {
	          promoters++;
	        }
	        else if (num >= 0 && num <= 6)
	        {
	          detractors++;
	        }
	        respondents++;  
	      }
	      double npScore = 100 * (double)(promoters - detractors) / respondents;
	      System.out.printf("Net Promoter Score is %.1f Percent\n",npScore);
	}

}
