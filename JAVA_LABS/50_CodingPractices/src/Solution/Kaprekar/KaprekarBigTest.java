package Solution.Kaprekar;

import java.util.*;

public class KaprekarBigTest {

	public static void main(String[] args) {
		// create sorted map
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		// define a list for the 'bad' numbers
		ArrayList<Integer> badnumbers = new ArrayList<Integer>();
		KaprekarConstant kc = new KaprekarConstant();
		// loop 9999 times
		for (int i = 1; i < 10000; i++) {
			// set next number to be used
			kc.setNumber(i);
			if (kc.isNumberOK() == false) {
				// it is a 1111,2222 etc number, add it it to 'bad' list
				badnumbers.add(i);
				continue;
			}
			// do-able number - how many lines in the proof
			int numberOfSteps = kc.getProof().size();
			// entry in map already?
			if (map.containsKey(numberOfSteps)) {
				int newvalue = map.get(numberOfSteps) + 1;
				// update existing map entry
				map.put(numberOfSteps, newvalue);
			}
			// make new entry for this number of steps
			else {
				map.put(numberOfSteps, 1);
			}
		}
		int grandtotal = 0;

		for (int key = 1; key <= map.size(); key++) {
			int occurences = map.get(key);
			grandtotal += occurences;

			String outputLine;
			outputLine = String.format("Took %d %s %d times", key,
					(key == 1) ? "step " : "steps", occurences);
			System.out.println(outputLine);
		}
		System.out.printf("%d succesful attempts in total\n", grandtotal);

		System.out.printf("\nHere are the %d 'bad' numbers\n",
				badnumbers.size());
		for (Integer num : badnumbers) {
			System.out.print(num + " ");

		}
	}
}
