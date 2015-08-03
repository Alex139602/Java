package Solution;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] things = { new Penguin("Pingu"), new Duck("Donald"),
				new Fish("Freddie") };

		System.out.println("### These are Consumable ###");

		for (Object o : things) {
			if (o instanceof Consumable) {
				Consumable ic = (Consumable) o;
				System.out.printf("%s,\t%s\n", ic.describeTaste(),
						ic.isMainCourseDish());
			}
		}

		System.out.println("\n### These are Insurable ###");

		for (Object o : things) {
			if (o instanceof Insurable) {
				Insurable ii = (Insurable) o;
				System.out.printf("%s,\t%s\n", ii.getPremium(), ii.expires());
			}
		}
		System.out.println();
	}
}
