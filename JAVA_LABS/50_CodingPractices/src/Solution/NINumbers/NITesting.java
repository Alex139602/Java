package Solution.NINumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class NITesting {

	@Test
	public void NINumberConstructorValidNumberTest() {
		// Arrange
		NINumber n = new NINumber("AB123456C");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Number as entered", "AB123456C", num);
		assertEquals("Formatted Number", "AB 12 34 56 C", formatted);
	}

	@Test
	public void NINumberConstructorValidNumberWithSpacesTest() {
		// Arrange
		NINumber n = new NINumber("AB  12  345  6  C");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Number as entered", "AB123456C", num);
		assertEquals("Formatted Number", "AB 12 34 56 C", formatted);
	}

	@Test
	public void NINumberConstructorValidNumberInLowercaseTest() {
		// Arrange
		NINumber n = new NINumber("ab123456c");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Number as entered", "AB123456C", num);
		assertEquals("Formatted Number", "AB 12 34 56 C", formatted);
	}

	@Test
	public void NINumberConstructorInvalidNumberEmptyStringTest() {
		// Arrange
		NINumber n = new NINumber("");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertFalse("Validity", valid);
		assertEquals("Number as entered", "", num);
		assertEquals("Formatted Number", "", formatted);
	}

	@Test
	public void NINumberConstructorInvalidNumberStringTooShortTest() {
		// Arrange
		NINumber n = new NINumber("AB123456");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertFalse("Validity", valid);
		assertEquals("Number as entered", "", num);
		assertEquals("Formatted Number", "", formatted);
	}

	@Test
	public void NINumberConstructorInvalidNumberStringTooLongTest() {
		// Arrange
		NINumber n = new NINumber("AB123456CC");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertFalse("Validity", valid);
		assertEquals("Number as entered", "", num);
		assertEquals("Formatted Number", "", formatted);
		//assertEquals(CrownDependency.None, n.getCrownDependency());
	}
	
	@Test
	public void NINumberConstructorInvalidNumber1st2CharsNotAlpha() {
		// Arrange
		NINumber n = new NINumber("A1123456Z");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertFalse("Validity", valid);
		assertEquals("Number as entered", "", num);
		assertEquals("Formatted Number", "", formatted);
		//assertEquals(CrownDependency.None, n.getCrownDependency());
	}
	@Test
	public void NINumberConstructorInvalidNumberLastCharNotAlpha() {
		// Arrange
		NINumber n = new NINumber("AB123456-");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertFalse("Validity", valid);
		assertEquals("Number as entered", "", num);
		assertEquals("Formatted Number", "", formatted);
		//assertEquals(CrownDependency.None, n.getCrownDependency());
	}
	@Test
	public void NINumberConstructorInvalidNumberMiddle6NotNumeric() {
		// Arrange
		NINumber n = new NINumber("AB123Z56Z");

		// Act
		boolean valid = n.isValid();
		String num = n.getNationalInsuranceNumber();
		String formatted = n.getFormattedNINumber();

		// Assert
		assertFalse("Validity", valid);
		assertEquals("Number as entered", "", num);
		assertEquals("Formatted Number", "", formatted);
		//assertEquals(CrownDependency.None, n.getCrownDependency());
	}

	@Test
	public void NINumberValidTemporaryNumberWithValidNumberTest() {
		// Arrange
		NINumber n = new NINumber("TF123456B");

		// Act
		boolean valid = n.isValid();
		boolean temp = n.isTemporaryNumber();

		// Assert
		assertTrue("Validity", valid);
		assertTrue("Temporary Number", temp);
//		assertEquals(CrownDependency.None, n.getCrownDependency());
//		assertFalse(n.isCrownDependency());
	}

	@Test
	public void NINumberInvalidTemporaryNumberWithInvalidNumberTest() {
		// Arrange
		NINumber n = new NINumber("TF12345B");

		// Act
		boolean valid = n.isValid();
		boolean temp = n.isTemporaryNumber();

		// Assert
		assertFalse("Validity", valid);
		assertFalse("Temporary Number", temp);
		//assertEquals("Crown Dependency", CrownDependency.None, n.getCrownDependency());
	}

	@Test
	public void NINumberValidCrownDependencyJYNumberWithValidNumberTest() {
		// Arrange
		NINumber n = new NINumber("JY123456B");

		// Act
		boolean valid = n.isValid();
		boolean crown = n.isCrownDependency();

		// Assert
		assertTrue("Validity", valid);
		assertTrue("Crown Dependency", crown);
		if (crown) {
			CrownDependency dep = n.getCrownDependency();
			assertEquals("dependency", CrownDependency.Jersey, dep);
		}
	}

	@Test
	public void NINumberValidCrownDependencyGYNumberWithValidNumberTest() {
		// Arrange
		NINumber n = new NINumber("GY123456B");

		// Act
		boolean valid = n.isValid();
		boolean crown = n.isCrownDependency();

		// Assert
		assertTrue("Validity", valid);
		assertTrue("Crown Dependency", crown);
		if (crown) {
			CrownDependency dep = n.getCrownDependency();
			assertEquals("dependency", CrownDependency.Guernsey, dep);
		}
	}

	@Test
	public void NINumberValidCrownDependencyMANumberWithValidNumberTest() {
		// Arrange
		NINumber n = new NINumber("MA123456B");

		// Act
		boolean valid = n.isValid();
		boolean crown = n.isCrownDependency();

		// Assert
		assertTrue("Validity", valid);
		assertTrue("Crown Dependency", crown);
		if (crown) {
			CrownDependency dep = n.getCrownDependency();
			assertEquals("dependency", CrownDependency.IsleOfMan, dep);
		}
	}

	@Test
	public void NINumberValidSigningOnDayMondayTest() {
		// Arrange
		NINumber n = new NINumber("AB123411A");

		// Act
		boolean valid = n.isValid();
		DayOfWeek d = n.getSigningOnDay();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Signing On Day", DayOfWeek.Monday, d);
	}

	@Test
	public void NINumberValidSigningOnDayTuesdayTest() {
		// Arrange
		NINumber n = new NINumber("AB123431A");

		// Act
		boolean valid = n.isValid();
		DayOfWeek d = n.getSigningOnDay();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Signing On Day", DayOfWeek.Tuesday, d);
	}

	@Test
	public void NINumberValidSigningOnDayWednesdayTest() {
		// Arrange
		NINumber n = new NINumber("AB123451A");

		// Act
		boolean valid = n.isValid();
		DayOfWeek d = n.getSigningOnDay();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Signing On Day", DayOfWeek.Wednesday, d);
	}

	@Test
	public void NINumberValidSigningOnDayThursdayTest() {
		// Arrange
		NINumber n = new NINumber("AB123461A");

		// Act
		boolean valid = n.isValid();
		DayOfWeek d = n.getSigningOnDay();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Signing On Day", DayOfWeek.Thursday, d);
	}

	@Test
	public void NINumberValidSigningOnDayFridayTest() {
		// Arrange
		NINumber n = new NINumber("AB123481A");

		// Act
		boolean valid = n.isValid();
		DayOfWeek d = n.getSigningOnDay();

		// Assert
		assertTrue("Validity", valid);
		assertEquals("Signing On Day", DayOfWeek.Friday, d);
	}

}
