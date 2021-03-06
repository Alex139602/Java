package time;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewTimeTest {

	@Test public void testNewTimeIntInt() {
		NewTime newTime = new NewTime(10, 10);
		assertEquals(newTime.getHours(), 10); // should be 10, tests the constructor and getters
	}

	@Test public void testValid24Time() {
		NewTime newTimThatIsWrong = new NewTime(99, 1000);
		boolean bool = newTimThatIsWrong.valid24Time();
		System.out.println(bool);
		assertFalse(bool); // should return false as this isnt a valid time
	}

	@Test public void testAddTime() {
		NewTime nt1 = new NewTime(14, 26);
		NewTime nt2 = new NewTime(16, 47);
		
		// nt1 + nt2 should give 30:73 which is 31:13 which --> 7:13
		
		nt1.addTime(nt2.getHours(), nt2.getMinutes());
		
		int actualHours = nt1.getHours();
		int actualMinutes = nt1.getMinutes();
		int expectedHours = 7;
		int expecetedMinutes = 13;
		assertTrue( ( actualHours == expectedHours ) && ( actualMinutes == expecetedMinutes ) ); 
	}
	
	@Test public void testAddTimeInvalid(){
		NewTime nt1 = new NewTime(12, 34);
		nt1.addTime(100, 100); // should syso invalid time
	}

	@Test public void testSubtractTime() {
		NewTime nt1 = new NewTime(14, 12);
		NewTime nt2 = new NewTime(16, 0);
		
		/*NewTime nt1 = new NewTime(20, 32);
		NewTime nt2 = new NewTime(8, 44);*/
		
		// nt1 - nt2 should give -2:12 which --> 22:12 
		
		nt1.subtractTime( nt2.getHours(), nt2.getMinutes() );
		
		int actualHours = nt1.getHours();
		int actualMinutes = nt1.getMinutes();
		int expectedHours = 22;
		int expecetedMinutes = 12;
		
		System.out.println( nt1.getCurrentTime() );
		assertTrue( ( actualHours == expectedHours ) && ( actualMinutes == expecetedMinutes ) ); 
	}

	@Test public void testGetCurrentTime() {
		NewTime nt = new NewTime(1, 9);
		String actual = nt.getCurrentTime();
		String expected = "1:09";
		assertEquals( expected, actual ); // checks if the format is correct, should return 1:09 not 1:9
	}

	
	
}
