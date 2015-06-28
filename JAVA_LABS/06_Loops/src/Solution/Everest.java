package Solution;

public class Everest {

	public static void main(String[] args) {
		double height = 8850;
		double growthRate = 0.000006893;
		int yearCount = 1000;

		for (int year = 0; year < yearCount; year++) {
			// height += (height * growthRate); or
			height *= (1 + growthRate);
		}
		System.out.printf("Height of Everest in 1000 years will be %.3f\n",
				height);

//		// enhancement
//		double yearlyGrowth = height * growthRate;
//		// remove loop completely
//		height += yearlyGrowth * yearCount;
//		System.out.printf("Height of Everest in 1000 years will be %.3f\n",
//				height);

	}

}
