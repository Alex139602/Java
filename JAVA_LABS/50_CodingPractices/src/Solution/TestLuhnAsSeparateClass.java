package Solution;

public class TestLuhnAsSeparateClass {

	public static void main(String[] args) {
		LuhnAsSeparateClass luhn = new LuhnAsSeparateClass(args[0]);

		if (luhn.isValid()) {
			System.out.printf("%s is a valid CC Number\n", args[0]);
		}
		else {
			System.out.println(luhn.getErrorMessage());
		}

	}

}
