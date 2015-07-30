import static org.junit.Assert.*;

import org.junit.Test;

public class NewWeightTest {

	@Test
	public void testValidWeight() {
		assertTrue(new NewWeight(1,1,1).validWeight());
		
	}
	
	@Test public void testNewWeight2(){
		assertFalse(new NewWeight(0,-1,88).validWeight());
	}


	@Test
	public void testAddWeight() {
		NewWeight nw1 = new NewWeight(1,6,4);
		NewWeight nw2 = new NewWeight(1, 2, 11);
		nw1.addWeight(nw2.getStones(), nw2.getPounds(), nw2.getOunces());
		
		System.out.println(nw1.toString());
		
		String expected = "2 stones 9 lbs 1 oz";
		
		assertTrue(expected == nw1.toString());
				
			
	}

	@Test
	public void testSubtractWeight() {
		NewWeight nw1 = new NewWeight(1,6,4);
		NewWeight nw2 = new NewWeight(1, 2, 11);
		nw1.subtractWeight(nw1.getStones(), nw2.getPounds(), nw2.getOunces());
		
		String expected = "3 lbs 9 oz"; // stones doesnt show
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentWeight() {
		fail("Not yet implemented");
	}

}
