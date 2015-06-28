package Solution.Lottery;

public class LotteryTest {

	public static void main(String[] args) {
		
		LotteryNumberGenerator lp = new LotteryNumberGenerator();
		
		int[] numbers = lp.generateNumbers();
		
		System.out.println("Play this combination :--");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
