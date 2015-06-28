package Solution;

public class AngleTester {

	public static void main(String[] args) {
		constructorTesting();
		
		addTesting();
		
		subtractTesting();
	}

	private static void constructorTesting() {
		System.out.println("Ctor Testing");
		System.out.println("-----------");
		Angle a1,a2,a3,a4,a5;
		a1 = new Angle(-1);
		a2 = new Angle(0);
		a3 = new Angle(1);
		a4 = new Angle(359);
		a5 = new Angle(360);
		
		
		System.out.println("Validity of Angles");
		System.out.printf("Expected %s %s %s %s %s\n", false, true, true, true, false);
		System.out.printf("Actual   %s %s %s %s %s\n", 
				              a1.getValidAngle(),a2.getValidAngle(),
				              a3.getValidAngle(),a4.getValidAngle(),
				                               a5.getValidAngle());
		System.out.println("\nValues of angles");
		System.out.printf("Expected: %s \tActual: %s\n", "Error", a1.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "No degrees", a2.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "1 degree", a3.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "359 degrees", a4.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "Error", a5.getCurrentAngle());
	}
	
	private static void addTesting() {
		System.out.println("\nAdd Testing");
		System.out.println("-----------");
		Angle a1,a2,a3,a4;
		a1 = new Angle(50);
		a2 = new Angle(50);
		a3 = new Angle(50);
		a4 = new Angle(360);
		
		a1.addAngle(-1); // goes invalid
		a2.addAngle(359);// good
		a3.addAngle(360);// goes invalid
		a4.addAngle(1);  // can't operate on invalid
		
		System.out.println("Validity of Angles");
		System.out.printf("Expected %s %s %s %s\n", false, true, false, false);
		System.out.printf("Actual   %s %s %s %s\n", 
				              a1.getValidAngle(),a2.getValidAngle(),
				              a3.getValidAngle(),a4.getValidAngle());
		System.out.println("\nValues of angles");
		System.out.printf("Expected: %s \tActual: %s\n", "Error", a1.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "49 degrees", a2.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "Error", a3.getCurrentAngle());
		System.out.printf("Expected: %s \tActual: %s\n", "Error", a4.getCurrentAngle());
		
		
		
		
	}
	
	private static void subtractTesting() {

			System.out.println("\nSubtract Testing");
			System.out.println("-----------");
			Angle a1,a2,a3,a4;
			a1 = new Angle(50);
			a2 = new Angle(50);
			a3 = new Angle(50);
			a4 = new Angle(360);
			
			a1.subtractAngle(-1); // goes invalid
			a2.subtractAngle(359);// good --> 51
			a3.subtractAngle(360);// goes invalid
			a4.subtractAngle(1);  // can't operate on invalid
			
			System.out.println("Validity of Angles");
			System.out.printf("Expected %s %s %s %s\n", false, true, false, false);
			System.out.printf("Actual   %s %s %s %s\n", 
					            a1.getValidAngle(),a2.getValidAngle(),
					            a3.getValidAngle(),a4.getValidAngle());
			System.out.println("\nValues of angles");
			System.out.printf("Expected: %s \tActual: %s\n", "Error", a1.getCurrentAngle());
			System.out.printf("Expected: %s \tActual: %s\n", "51 degrees", a2.getCurrentAngle());
			System.out.printf("Expected: %s \tActual: %s\n", "Error", a3.getCurrentAngle());
			System.out.printf("Expected: %s \tActual: %s\n", "Error", a4.getCurrentAngle());		
		}	
}
