package Solution.Volume;

import static org.junit.Assert.*;

import org.junit.Test;

public class VolumeTesting {

	
	// getCurrentVolumeTest
	@Test
	public void testGetCurrentVolume() {
		Volume v1 = new Volume(0, 0);
		String expected = "0 gallons 0 pints";
		String actual = v1.getCurrentVolume();
		assertEquals(expected, actual);
		
		v1.addVolume(0, 7);
		expected = "0 gallons 7 pints";
		actual = v1.getCurrentVolume();
		assertEquals(expected, actual);
		
		v1.addVolume(10, 0);
		expected = "10 gallons 7 pints";
		actual = v1.getCurrentVolume();
		assertEquals(expected, actual);
		
		v1.addVolume(0, 8);
		actual = v1.getCurrentVolume();
		assertEquals("", actual);
	}
    
	// ctor Tests
	@Test
	public void testCtorZeros() {
		Volume v = new Volume(0, 0);
		assertEquals(0, v.getGallons());
		assertEquals(0, v.getPints());
		assertTrue(v.getValidVolume());
	}
	@Test
	public void testCtorUpperPints() {
		Volume v = new Volume(0, 7);
		assertEquals(0, v.getGallons());
		assertEquals(7, v.getPints());
		assertTrue(v.getValidVolume());
	}
	@Test
	public void testCtorOverflowPints() {
		Volume v = new Volume(0, 8);
		assertEquals(0, v.getGallons());
		assertEquals(8, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testCtorNegativePints() {
		Volume v = new Volume(0, -1);
		assertEquals(0, v.getGallons());
		assertEquals(-1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testCtorNegativeGallons() {
		Volume v = new Volume(-1, 0);
		assertEquals(-1, v.getGallons());
		assertEquals(0, v.getPints());
		assertFalse(v.getValidVolume());
	}
	// end of ctor tests
	
	// start of add tests
	@Test
	public void testAddVolumeAddToAlreadyInvalidVolume() {
		Volume v = new Volume(0, 8);
		v.addVolume(1, 1);
		assertEquals(0, v.getGallons());
		assertEquals(8, v.getPints());
		assertFalse(v.getValidVolume());	
	}
	@Test
	public void testAddVolumeAddInvalidGallons() {
		Volume v = new Volume(1, 1);
		v.addVolume(-1, 0);
		assertEquals(1, v.getGallons());
		assertEquals(1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testAddVolumeAddInvalidPintsLessThanZero() {
		Volume v = new Volume(1, 1);
		v.addVolume(0,-1);
		assertEquals(1, v.getGallons());
		assertEquals(1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testAddVolumeAddInvalidPintsGreaterThanSeven() {
		Volume v = new Volume(1, 1);
		v.addVolume(0, 8);
		assertEquals(1, v.getGallons());
		assertEquals(1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testAddVolumeAddValidVolumeNoOverflow() {
		Volume v = new Volume(1, 1);
		v.addVolume(3,6);
		assertEquals(4, v.getGallons());
		assertEquals(7, v.getPints());
		assertTrue(v.getValidVolume());
	}
	@Test
	public void testAddVolumeAddValidVolumeOverflowPints() {
		Volume v = new Volume(1, 1);
		v.addVolume(3, 7);
		assertEquals(5, v.getGallons());
		assertEquals(0, v.getPints());
		assertTrue(v.getValidVolume());
	}	
	// end of add tests
	
	// start of subtractVolume tests
	@Test
	public void testSubtractVolumeFromAlreadyInvalidVolume() {
		Volume v = new Volume(0, 8);
		v.subtractVolume(1, 1);
		assertEquals(0, v.getGallons());
		assertEquals(8, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeInvalidGallons() {
		Volume v = new Volume(1, 1);
		v.subtractVolume(-1, 0);
		assertEquals(1, v.getGallons());
		assertEquals(1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeInvalidPintsLessThanZero() {
		Volume v = new Volume(1, 1);
		v.subtractVolume(0, -1);
		assertEquals(1, v.getGallons());
		assertEquals(1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeInvalidPintsGreaterThanSeven() {
		Volume v = new Volume(1, 1);
		v.subtractVolume(0, 8);
		assertEquals(1, v.getGallons());
		assertEquals(1, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeValidVolumesNoUnderflows() {
		Volume v = new Volume(4, 4);
		v.subtractVolume(3, 2);
		assertEquals(1, v.getGallons());
		assertEquals(2, v.getPints());
		assertTrue(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeValidVolumeUnderflowPints() {
		Volume v = new Volume(4, 4);
		v.subtractVolume(2, 5);
		assertEquals(1, v.getGallons());
		assertEquals(7, v.getPints());
		assertTrue(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeValidVolumeUnderflowGallons() {
		Volume v = new Volume(4, 4);
		v.subtractVolume(5, 2);
		assertEquals(4, v.getGallons());
		assertEquals(4, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeValidVolumeUnderflowGallonsByUnderflowingPints() {
		Volume v = new Volume(4, 4);
		v.subtractVolume(4, 5);
		assertEquals(4, v.getGallons());
		assertEquals(4, v.getPints());
		assertFalse(v.getValidVolume());
	}
	@Test
	public void testSubtractVolumeToZero() {
		Volume v = new Volume(4, 4);
		v.subtractVolume(4, 4);
		assertEquals(0, v.getGallons());
		assertEquals(0, v.getPints());
		assertTrue(v.getValidVolume());
	}
	//end of subtract tests
}





