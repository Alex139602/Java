package Solution.WorkingWithMoney;

public class Program {

	public static void main(String[] args) {
		//testingWhenOnlyPence();
	    testingWhenPoundsAndPence();
	      


	    }

	    
	    private static void testingWhenOnlyPence() {
	      
//	      // Initial ctor testing
//	      Money m1, m2, m3, m4, m5;
//	      m1 = new Money(-1);
//	      m2 = new Money(0);
//	      m3 = new Money(99);
//	      m4 = new Money(100);
//	      // Should display - False True True False 
//	      System.out.println("Ctor testing");
//	      System.out.println("------------");
//	      System.out.println("Expected: false true true false");
//	      System.out.printf("Actual:   %s %s %s %s\n", 
//	                            m1.getValidMoney(), m2.getValidMoney(), 
//	                            m3.getValidMoney(), m4.getValidMoney());
//
//	      System.out.printf("Expected %s Actual %s\n", "Error", m1.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "£0.00", m2.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "£0.99", m3.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "Error", m4.getCurrentMoney());
//
//	      // Add Money testing
//	      m1 = new Money(50);
//	      m1.addMoney(-1);
//	      
//	      m2 = new Money(50);
//	      m2.addMoney(99);
//
//	      m3 = new Money(50);
//	      m3.addMoney(100);
//	      
//	      m4 = new Money(100);
//	      m4.addMoney(1);
//
//	      // Should display - False True False False 
//	      System.out.println("\nBasic Add Tests");
//	      System.out.println("---------------");
//	      System.out.println("Expected: false true false false");
//	      System.out.printf("Actual:   %s %s %s %s\n", 
//	                              m1.getValidMoney(), m2.getValidMoney(), 
//	                              m3.getValidMoney(), m4.getValidMoney());
//	      // Should display "Error","£1.49","Error","Error"
//	      System.out.printf("Expected %s Actual %s\n", "Error", m1.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "£1.49", m2.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "Error", m3.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "Error", m4.getCurrentMoney());
//
//
//
//	      // Subtract money testing
//	      m1 = new Money(50);
//	      m1.subtractMoney(-1);
//	 
//	      m2 = new Money(50);
//	      m2.subtractMoney(40);
//	      
//	      m3 = new Money(50);
//	      m3.subtractMoney(100);
//
//	      m4 = new Money(50);
//	      m4.subtractMoney(60);
//
//	      m5 = new Money(100);
//	      m5.subtractMoney(1);
//
//	      // Should display - False True False False False
//	      System.out.println("\nBasic Subtract Tests");
//	      System.out.println("--------------------");
//	      System.out.println("Expected: false true false false false");
//	      System.out.printf("Actual:   %s %s %s %s %s\n", 
//	                 m1.getValidMoney(), m2.getValidMoney(), m3.getValidMoney(),
//	                                m4.getValidMoney(), m5.getValidMoney());
//
//	      // Should display "Error","£0.10","Error","Error", "Error"
//	      System.out.printf("Expected %s Actual %s\n", "Error", m1.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "£0.10", m2.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "Error", m3.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "Error", m4.getCurrentMoney());
//	      System.out.printf("Expected %s Actual %s\n", "Error", m5.getCurrentMoney());
	      
	    }
	     
	    private static void testingWhenPoundsAndPence() {
	      Money m1, m2, m3, m4, m5, m6;
	      m1 = new Money(-1, 50);
	      m2 = new Money(1, 100);
	      m3 = new Money(1, 50);
	      m4 = new Money(1, 50);
	      m5 = new Money(1, 50);
	      m6 = new Money(1, 50);
	      // Should display - False False True True True True 
	      System.out.println("Ctor testing");
	      System.out.println("------------");
	      System.out.println("Expected: false false true true true true");
	      System.out.printf("Actual:   %s %s %s %s %s %s\n", 
	                      m1.getValidMoney(), m2.getValidMoney(), m3.getValidMoney(),
	                      m4.getValidMoney(), m5.getValidMoney(), m6.getValidMoney());

	      m1.addMoney(1, 20);
	      m2.addMoney(1, 20);
	      m3.addMoney(0, 100);
	      m4.addMoney(-1, 20);
	      m5.addMoney(1, 50);
	      m6.addMoney(1, 49);

	      // Should display - false false false false true true 
	      System.out.println("\nBasic Add Tests Pounds and Pence");
	      System.out.println("--------------------------------");
	      System.out.println("Expected: false false false false true true");
	      System.out.printf("Actual:   %s %s %s %s %s %s \n", 
	                     m1.getValidMoney(), m2.getValidMoney(), m3.getValidMoney(),
	                     m4.getValidMoney(), m5.getValidMoney(), m6.getValidMoney());

	      System.out.printf("Expected: %s  Actual: %s\n", "Error", m1.getCurrentMoney());
	      System.out.printf("Expected: %s  Actual: %s\n", "Error", m2.getCurrentMoney());
	      System.out.printf("Expected: %s  Actual: %s\n", "Error", m3.getCurrentMoney());
	      System.out.printf("Expected: %s  Actual: %s\n", "Error", m4.getCurrentMoney());
	      System.out.printf("Expected: %s  Actual: %s\n", "£3.00", m5.getCurrentMoney());
	      System.out.printf("Expected: %s  Actual: %s\n", "£2.99", m6.getCurrentMoney());

	      //// Subtract money testing
	      m1 = new Money(-1, 50);
	      m1.subtractMoney(1, 20);

	      m2 = new Money(1, 100);
	      m2.subtractMoney(1, 20);

	      m3 = new Money(1, 50);
	      m3.subtractMoney(0, 100);

	      m4 = new Money(1, 50);
	      m4.subtractMoney(-1, 20);

	      m5 = new Money(1, 50);
	      m5.subtractMoney(1, 51);

	      m6 = new Money(2, 50);
	      m6.subtractMoney(1, 51);

	      //// Should display - false false false false false true
	      System.out.println("\nSubtract Tests Pounds and Pence");
	      System.out.println("-------------------------------");
	      System.out.println("Expected: false false false false false true");
	      System.out.printf("Actual:   %s %s %s %s %s %s \n", 
	    		  m1.getValidMoney(), m2.getValidMoney(), m3.getValidMoney(),
                  m4.getValidMoney(), m5.getValidMoney(), m6.getValidMoney());


	      System.out.printf("Expected: %s   Actual: %s\n", "Error", m1.getCurrentMoney());
	      System.out.printf("Expected: %s   Actual: %s\n", "Error", m2.getCurrentMoney());
	      System.out.printf("Expected: %s   Actual: %s\n", "Error", m3.getCurrentMoney());
	      System.out.printf("Expected: %s   Actual: %s\n", "Error", m4.getCurrentMoney());
	      System.out.printf("Expected: %s   Actual: %s\n", "Error", m5.getCurrentMoney());
	      System.out.printf("Expected: %s   Actual: %s\n", "£0.99", m6.getCurrentMoney());

	    }

}
