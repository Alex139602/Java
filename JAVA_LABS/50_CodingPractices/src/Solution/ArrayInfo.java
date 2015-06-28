package Solution;

import java.util.*;

public class ArrayInfo {

	private int sum, min, max;
	private double avg;
	private int[] values; // to hold incoming array

	// Constuctor
	public ArrayInfo(int[] values) {
		if (values.length == 0) {
			return;
		}
		// store values
		this.values = values;
		// init running total
		sum = 0;
		// first number is the biggest and the smallest
		min = values[0];
		max = values[0];
		// is next number either biggest or smallest (so far)
		for (int value : values) {
			sum += value;
			if (value < min)
				min = value;
			if (value > max)
				max = value;
		}
		// average calculated at end
		avg = (double) sum / values.length;

	}

	public double getAverage() {
		return avg;
	}

	public int getSum() {
		return sum;
	}

	public int getMinimum() {
		return min;
	}

	public int getMaximum() {
		return max;
	}

	// Challenge portion
	public int getCountOfUniqueNumbers() {

		Arrays.sort(values);
		// process 1st element which is a unique number
		int lastVal = values[0];
		int count = 1;
		// process the rest
		for (int i = 1; i < values.length; i++) {
			if (values[i] == lastVal)
				continue;
			// new value
			lastVal = values[i];
			count++;
		}
		return count;

	}

	public int[] getMostPopularNumbers() {

		Arrays.sort(values);
		// create 2 arrays full sized
		int[] numbers = new int[values.length];
		int[] occurences = new int[values.length];
		// populate the 2 arrays, 1 that stores unique values
		// and one that stores counts of occurences of that value
		int newSize = populateBothArrays(numbers, occurences);

		// truncate both
		numbers = Arrays.copyOf(numbers, newSize);
		occurences = Arrays.copyOf(occurences, newSize);

		// find biggest value in occurences
		int biggestOccurenceValue = findBiggestValue(occurences);
		int count = 0;
		int[] mostPop = new int[occurences.length];
		for (int i = 0; i < occurences.length; i++) {
			if (occurences[i] == biggestOccurenceValue) {
				mostPop[count++] = numbers[i];

			}
		}
		return Arrays.copyOf(mostPop, count);
	}

	public int[] getLeastPopularNumbers() {

		Arrays.sort(values);
		// create 2 arrays full sized
		int[] numbers = new int[values.length];
		int[] occurences = new int[values.length];

		// populate the 2 arrays, 1 that stores unique values
		// and one that stores counts of occurences of that value
		int newSize = populateBothArrays(numbers, occurences);

		numbers = Arrays.copyOf(numbers, newSize);
		occurences = Arrays.copyOf(occurences, newSize);

		// find smallest value in occurencesOfValue
		int smallestOccurenceValue = findSmallestValue(occurences);

		int count = 0;
		int[] leastPopular = new int[occurences.length];
		for (int i = 0; i < occurences.length; i++) {
			if (occurences[i] == smallestOccurenceValue) {
				leastPopular[count++] = numbers[i];
			}
		}
		return Arrays.copyOf(leastPopular, count);
	}

	public int[] getOdds() {

		int[] odds = new int[values.length];
		int count = 0;
		for (int num : values) {
			int rem = num % 2;
			if (rem == 1 || rem == -1) {
				odds[count++] = num;
			}
		}
		return removeDuplicates(Arrays.copyOf(odds, count));
	}

	public int[] getEvens() {

		int[] evens = new int[values.length];
		int count = 0;
		for (int num : values) {
			if (num % 2 == 0) {
				evens[count++] = num;
			}
		}
		return removeDuplicates(Arrays.copyOf(evens, count));
	}

	public int[] getUniques() {

		Arrays.sort(values);
		return removeDuplicates(values);
	}

	// this method exists to be used by Uniques and Evens and Odds
	private int[] removeDuplicates(int[] numbers) {
		if (numbers.length == 0)
			return numbers;
		// might all be unique..
		int[] uniques = new int[numbers.length];

		// process 1st element which is by def'n a unique number
		uniques[0] = numbers[0];
		int previousVal = numbers[0];
		int count = 1;
		// process the rest
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == previousVal)
				continue;
			// new unique value
			uniques[count++] = numbers[i];
			// remember it as last unique number
			previousVal = numbers[i];

		}
		return Arrays.copyOf(uniques, count);

	}

	// other helper routines
	private int findBiggestValue(int[] occurences) {
		// first is biggest (for now)
		int biggest = occurences[0];
		// start at 1 not 0
		for (int i = 1; i < occurences.length; i++) {
			if (occurences[i] > biggest)
				biggest = occurences[i];
		}
		return biggest;
	}

	private int findSmallestValue(int[] occurences) {
		// first is smallest (for now)
		int smallest = occurences[0];
		// start at 1 not 0
		for (int i = 1; i < occurences.length; i++) {
			if (occurences[i] < smallest)
				smallest = occurences[i];
		}
		return smallest;
	}

	private int populateBothArrays(int[] numbers, int[] occurences) {
		// make entry in arrays in respect of element 0
		int count = 0;
		numbers[0] = values[0];
		occurences[0] = 1;
		int previousVal = values[0];

		// it should be anyway
		// process the rest of 'values'
		for (int i = 1; i < values.length; i++) {
			// value same as last one?
			if (values[i] == previousVal) {
				occurences[count]++;
				continue;
			}
			// new value in values[i]
			numbers[++count] = values[i];
			occurences[count] = 1;
			previousVal = values[i];
		}
		return ++count;

	}
}
