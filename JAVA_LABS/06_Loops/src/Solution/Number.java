package Solution;

public class Number {

	public static void main(String[] args) {
		long result = 1, maxValue = 9999999999L;
		for (int i = 1; i < 64; i++) {
			result *= 2;
			if (result > maxValue) {
				break;
			}
			//System.out.printf("%2d", i);
			//System.out.printf("\t%10d\n", result);
			printFormatted(result, i);
		}
	}
	private static void printFormatted(long result, int i) {
		System.out.printf("%2d\t%10d\n", i, result);
	}

}
