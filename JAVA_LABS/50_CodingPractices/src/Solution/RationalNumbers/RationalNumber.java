package Solution.RationalNumbers;

public class RationalNumber {

	private int numerator;
	private int denominator;

	// throws Exception when Denom == 0
	// Creates simplest fraction and ensures Denom > 0
	public RationalNumber(int numer, int denom) {
		if (denom == 0) {
			// Exceptions not yet taught
			// throw new ArgumentOutOfRangeException("denom", denom,
			// "Denom cannot be zero");
			denom = 1;
		}

		numerator = numer;
		denominator = denom;
		findHighestCommonFactorAndSimplify();
	}

	public RationalNumber(int numer) {

		this(numer, 1);
	}

	public String asString() {
		if (numerator == 0 || denominator == 1) {
			return numerator + "";
		}
		// Denominator not -ve after ctor
		return numerator + "/" + denominator;
	}

	public double asNumber() {

		return (double) numerator / denominator;
	}

	// 1/2 & 1/4 --> 2/4 & 1/4
	public void add(RationalNumber rn) {

		// 2/5 + 3/4
		// = ((2*4)+(3*5)) / (4*5)
		// = 23/20

		this.numerator = ((numerator * rn.denominator) + (rn.numerator * denominator));
		denominator *= rn.denominator;

		findHighestCommonFactorAndSimplify();

	}

	public void add(int numerator, int denominator) {

		RationalNumber rn = new RationalNumber(numerator, denominator);
		add(rn);
	}

	public void add(int numerator) {

		RationalNumber rn = new RationalNumber(numerator);
		add(rn);
	}

	// This method will rationalise and ensure
	// denominator is not -ve
	// -2/-4 becomes 1/2
	// 3/-9 becomes -1/3
	private void findHighestCommonFactorAndSimplify() {
		// scenarios
		// 1 & 3 -- 1
		// 3 & 1 -- 1
		// 0 & 7 -- 1
		// 6 & 12 -- 6
		// 12 & 6 -- 6
		// 4 & 7 -- 1
		// 7 & 4 -- 1
		// 12 & -6 -- -6
		// -6 & 12 -- -6
		int hcf = 1;
		// is hcf the denominator
		if (numerator % denominator == 0) {
			hcf = denominator;
		}
		// is hcf the numerator
		else if (denominator % numerator == 0) {
			hcf = numerator;
		}
		// do they have a common factor
		// if 6 & 8 need to see if both divisible by 3 then 2
		// if 40 & 48 need to see if both divisible by 20,19,18,17,16
		// will be when 8
		// if 32 & 48 need to see if divisible by 16 then 15 , 14 etc
		// if 33 & 48 start at 16 eventually hcf = 3
		else {
			int smallerOfTheTwo = Math.min(Math.abs(numerator),
					Math.abs(denominator));
			for (int i = smallerOfTheTwo / 2; i > 1; i--) {
				if (denominator % i == 0) {
					if (numerator % i == 0) {
						hcf = i;
						break;
					}
				}
			}
		}
		// might still be 1
		numerator /= hcf;
		denominator /= hcf;

		if (denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}
	}
}
