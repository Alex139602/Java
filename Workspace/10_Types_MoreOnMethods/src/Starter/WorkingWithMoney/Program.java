package Starter.WorkingWithMoney;

public class Program {
	
	
    public static void main(String[] args) {
      // to be used in Part 1 of money 
      //testingWhenOnlyPence();
      
      

      // to be used in Part 2 after Pounds are introduced as parameters  
      testingWhenPoundsAndPence(); 
    } // end of main
    
     
    private static void testingWhenPoundsAndPence() {
    	Money m1, m2, m3, m4;
    	
    	m1 = new Money(9, 64); // valid False
    	m2 = new Money(0, 0); // valid true
    	m3 = new Money(99, 164); // valid true
    	m4 = new Money(100, 10); // valid false
    	
    	Money[] mAr = new Money[]{ m1, m2, m3, m4 };
    	
    	for (Money money : mAr) {
			//System.out.println(money.getValidMoney());
    		
			//System.out.println(money.getCurrentMoney());
			//System.out.println("\r\n");
		}
    	
    	m1.addMoney(1, 50);
    	System.out.println(m1.toString());
    }
  }