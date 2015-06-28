package Solution.Kaprekar;
import java.util.*;
public class KaprekarConstant {
	
	private int number;
	private final int KAPREKAR_CONSTANT = 6174;
	
	private ArrayList<Integer> fourDigits = new ArrayList<Integer>();
	
	public KaprekarConstant(int number) {
		this.setNumber(number);
	}

	public KaprekarConstant() {	}

	// returns true if not a multiple of 1111
	public boolean isNumberOK() {
		return getNumber() % 1111 != 0;
	}

	public ArrayList<String> getProof() {

		ArrayList<String> proof = new ArrayList<String>(); 
		
		int difference = 0;
		
		while (difference != KAPREKAR_CONSTANT) {
			// splits the current value of number
			splitNumberIntoArrayListOf4Digits();
			// get digits into ascending sequence eg 3-5-7-9
			Collections.sort(fourDigits);
			// produce a number eg 3579
			int smallnumber = make4DigitNumberFromArray();
			// reverse the digits eg 9-7-5-3
			Collections.reverse(fourDigits);
			// produce second number eg 9753
			int bignumber = make4DigitNumberFromArray();
			// produce the difference 9753 - 3579 --> 6174
			difference = bignumber - smallnumber;
			// make a line of format "x - y = z"
			String line = String.format("%4d - %4d = %4d", 
					               bignumber, smallnumber, difference);
			proof.add(line);
			// makes the new difference the value 
			// in 'number' ready to try again
			setNumber(difference);
		}
		return proof;
	}
	
	private void splitNumberIntoArrayListOf4Digits() {
		fourDigits.clear();
		fourDigits.add(number % 10000 / 1000);
		fourDigits.add(number % 1000 / 100);
		fourDigits.add(number % 100 / 10);
		fourDigits.add(number % 10 / 1);
	}

	private int make4DigitNumberFromArray() {
		
		return  fourDigits.get(0) * 1000 + 
			    fourDigits.get(1) * 100 + 
		        fourDigits.get(2) * 10 + 
		        fourDigits.get(3);
	}

	private int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	

}
