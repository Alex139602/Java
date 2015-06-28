package Solution;

class SieveOfEratosthenes {
	public static void main(String[] args) {
		// set upper limit of range of prime numbers req'd
		int limit = 100;
		// create array of that size + 1, so if limit is 100
		// then array is elements 0 - 100
		boolean[] flags = new boolean[limit];
		// all will default to false

		// make every value from 2 upwards = true
		// i.e all from 2 upwards considered prime at this stage
		for (int i = 2; i < flags.length; i++) {
			flags[i] = true;
		}

		generatePrimesTechnique1(flags);
		print(limit, flags);

		generatePrimesTechnique2(flags);
		print(limit, flags);

		generatePrimesTechnique3(flags);
		print(limit, flags);

	}

	// EACH of these 3 methods has 2 code fragments for the nested loop
	// as some students see it one way some the other

	// One way - sets the value of 'j' at start
	// of loop to a value based on what 'i' is and then changes
	// the value of 'j' again based on 'i's current value and only tests
	// flags[j] i.e. when i = 5, j might start on 10 and get changed to 15,20,25
	// with this technique you NEVER see 'i * j' coded
	// A second way is to start j on a value, to then change j by maybe
	// j++ or j+=2 (i.e. regardless of i's value) but to then always use
	// the value i*j when setting a flag (flags[i*j]).
	// but if 2nd technique is used you always need to be testing for
	// 'is i * j too big, if so break'

	private static void generatePrimesTechnique1(boolean[] flags) {
		// start at 2 go up to end of array
		// int numiterations = 0;

		for (int i = 2; i < flags.length; i++) {
			if (flags[i]) // i.e is a prime then set multiples to not prime
			{
				// start at double loop index, moving on to 3 *, 4 * etc
				for (int j = i * 2; j < flags.length; j += i) {
					// numiterations++;
					flags[j] = false;
				}
				// or
				// for (int j = 2; j < flags.length; j++) {
				// if (i * j >= flags.length)
				//   break;
				// numiterations++;
				// flags[i * j] = false;
				// }
			}
			// if already set as not a prime then do nothing as
			// all multiples will be already set as not prime
			// e.g when i = 4 flags[i] is already false as 4 was a
			// multiple of 2, no need to worry about multiples of 4 as
			// they are by definition multiples of 2 also and have been set
			else {

			}
		}

		// System.out.println(numiterations);
	}

	private static void generatePrimesTechnique2(boolean[] flags) {
		// start at 2 go up to end of array
		// int numiterations = 0;
		for (int i = 2; i < flags.length; i++) {
			if (flags[i]) // i.e is a prime then set multiples to not prime
			{
				// Enhancement - start at outerloopvalue squared as
				// all smaller multiples of outerloopvalue will have
				// already been set to
				// false, moving on to 3 *, 4 * etc
				for (int j = i * i; j < flags.length; j += i) {
					// numiterations++;
					flags[j] = false;
				}
				// or
				// for (int j = i; j < flags.length; j++) {
				//
				// if (i * j >= flags.length) {
				//   break;
				// }
				// numiterations++;
				// flags[i * j] = false;
				// }
			}
			// if already set as not a prime then do nothing as
			// all multiples will be already set as not prime
			else {
			}
		}
		// System.out.println(numiterations);
	}

	private static void generatePrimesTechnique3(boolean[] flags) {
		// start at 3 go up to end of array, may need to be a
		// 'long' for i squared
		// int numiterations = 0;
		for (int i = 3; i < flags.length; i++) {
			// only consider odd values as print routine is going to ignore
			// even numbers > 2
			if (i % 2 == 0) {
				continue;
			}
			if (flags[i]) // i.e is a prime so set multiples to not prime
			{
				// Further Enhancement - start at outerloopvalue squared as
				// all smaller multiples of outerloopvalue will have already
				// been set to false, BUT then only check odd multiples
				// by incrementing moving on to 3 *, 5 *, 7 * etc
				for (int j = i * i; j < flags.length; j += (i * 2)) {
					// numiterations++;
					flags[j] = false;
				}
				// // or
				// for (int j = i; j < flags.length; j += 2) {
				// if (i * j > flags.length) {
				//   break;
				// }
				// numiterations++;
				// flags[i * j] = false;
				// }
			}
			// if already set as not a prime then do nothing as
			// all multiples will be already set as not prime
			else {
			}
		}
		// System.out.println(numiterations);
	}

	private static void print(int limit, boolean[] flags) {
		String output = "";
		for (int i = 2; i < flags.length; i++) {
			if (i > 2 && i % 2 == 0) // even numbers gt 2, ignore
			{
				continue;
			}
			if (flags[i]) {
				output += i;
				output += " ";
			}
		}
		output = output.substring(0, output.length() - 1); // remove trailing
															// space

		System.out.printf("The prime numbers up to %d are\n", limit);
		System.out.println(output);
		System.out.println();

		// With a StringBuilder

		// StringBuilder primes = new StringBuilder();
		// for (int i = 2; i < flags.Length; i++)
		// {
		// if (i > 2 && i % 2 == 0) // even numbers gt 2, ignore
		// {
		// continue;
		// }
		// if (flags[i])
		// {
		// primes.Append(i + "\t");
		// }
		// }
		// primes.Remove(primes.Length - 1, 1); // remove trailing tab char
		// System.out.println("The prime numbers up to {0} are", limit);
		// System.out.println(primes.ToString());
	}
}
