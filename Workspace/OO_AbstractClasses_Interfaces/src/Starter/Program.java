package Starter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] things = { 
				new Penguin("Pingu"), 
				new Duck("Donald"),
				new Fish("Freddie") };

		System.out.println("\n\t### These are Consumable ###");

		// loop / test / downcast ref's and call
		
		for (Object o : things) {
			if (o instanceof IConsumable) {
				IConsumable ic = (IConsumable) o;
				System.out.println( ic.describeTaste() + "\t\t" + ic.isMainCourseDish() );
			} 
		}

		System.out.println("\n\t### These are Insurable ###");
		
		for (Object o : things) {
			if (o instanceof IInsurable) {
				IInsurable ii = (IInsurable)o;
				System.out.println(ii.getPremium() + "\t\t" + ii.expires() );
			}
		}
		
		System.out.println();
	}
}
