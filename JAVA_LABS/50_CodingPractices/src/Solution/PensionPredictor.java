package Solution;

public class PensionPredictor {

	public static void main(String[] args) {
		  int startAge = 21, retireAge = 67;
	      double salary = 18000, pensionFund = 0;

	      double higherPayRiseRate = 5, lowerPayRiseRate = 2;

	      double contributionPercent = 10, fundGrowthRate = 6;
	      int age, ageAtWhichLowerPayRisesCutIn = 41;

	      double totalContributions = 0;

	      for (age = startAge; age < retireAge; age++)
	      {
	        // calculate this years contribution
	        double thisYearPensionContribution 
	                = salary * contributionPercent / 100;
	        
	        // add it to total contributions (needed in Part 2)
	        totalContributions += thisYearPensionContribution;

	        // add this years contribution to the fund
	        pensionFund += thisYearPensionContribution;
	        // grow the fund
	        pensionFund *= (1 + fundGrowthRate / 100);

	        // end of year - salary rise 
	        if (age < ageAtWhichLowerPayRisesCutIn) // true at age 40
	        {
	          salary *= (1 + higherPayRiseRate / 100);
	        }
	        else // true from age 41
	        {
	          salary *= (1 + lowerPayRiseRate / 100);
	        }

	      }
	      double roundedPensFund = Math.round(pensionFund);
	      System.out.printf("Value of Pension Fund = £%.0f\n", roundedPensFund);


	      // Part 2
	      double inflFactor = Math.pow(.975, 46);
	      
	      double annuityRate = 6;
	      double fundAtCurrentPrices, taxfreeLumpSum;
	      double totalContributionsLessTaxRelief, annuity;


	      fundAtCurrentPrices = pensionFund * inflFactor;
	      taxfreeLumpSum = fundAtCurrentPrices * .25;
	      annuity = fundAtCurrentPrices * .75 * annuityRate / 100;
	      totalContributionsLessTaxRelief = totalContributions * .8;
	      
	      System.out.printf("Value of Fund at Todays Prices = £%.0f\n", fundAtCurrentPrices);
	      
	      System.out.printf("Value of 25%% tax free lump sum £%.0f\n" , taxfreeLumpSum );
	      
	      System.out.printf("Pension available from annuity = £%.0f\n",annuity);

	      
	      System.out.printf("Cost of total contributions assuming 20%% tax relief = £%.0f\n",
	          totalContributionsLessTaxRelief);

	}

}
