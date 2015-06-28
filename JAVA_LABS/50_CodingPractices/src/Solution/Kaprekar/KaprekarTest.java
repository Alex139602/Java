package Solution.Kaprekar;
import java.util.*;

public class KaprekarTest {

	public static void main(String[] args) {
		System.out.println("Enter a 1-4 digit number with at least 2 different digits in");
		Scanner sc = new Scanner(System.in);
		int testnumber = sc.nextInt();
		if (testnumber > 9999) {
			System.err.println("TestNumber must be a (max) four digit number");
			return;
		}

		// create one instance
		KaprekarConstant kc = new KaprekarConstant(testnumber);

		if (kc.isNumberOK()) {
			ArrayList<String> theProof = kc.getProof();
			System.out.println("Starting number was: " + testnumber);
			for (String line : theProof) {
				System.out.println(line);
			}
		}
		else {
			System.err.println("Will not work for multiples of 1111");
		}

	}

}
