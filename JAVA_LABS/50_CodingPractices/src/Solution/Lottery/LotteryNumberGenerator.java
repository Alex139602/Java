package Solution.Lottery;

import java.util.Arrays;
import java.util.Random;

public class LotteryNumberGenerator {
	
	private int[] numbers = new int[6];

	public int[] generateNumbers() {

		Random r = new Random();
		do {
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = r.nextInt(49) + 1;
			}
			Arrays.sort(numbers);

		} while (duplicateFound());
		return numbers;
	}

	private boolean duplicateFound() {
		boolean duplicatefound = false;

		for (int j = 0; j < numbers.length - 1; j++) {
			if (numbers[j] == numbers[j + 1]) {
				duplicatefound = true;
			}
		}
		return duplicatefound;
	}
}
