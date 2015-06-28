package Solution.RationalNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRationalViaJUnit {

	@Test
	public void ctorTest1_3_0() {
		RationalNumber rn = new RationalNumber(3, 0);
		String expected = "3";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest2_4_7() {
		RationalNumber rn = new RationalNumber(4, 7);
		String expected = "4/7";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest3_7_4() {
		RationalNumber rn = new RationalNumber(7, 4);
		String expected = "7/4";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest4_4_8() {
		RationalNumber rn = new RationalNumber(4, 8);
		String expected = "1/2";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest5_8_4() {
		RationalNumber rn = new RationalNumber(8, 4);
		String expected = "2";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest6_Neg8_4() {
		RationalNumber rn = new RationalNumber(-8, 4);
		String expected = "-2";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest7_8_Neg4() {
		RationalNumber rn = new RationalNumber(8, -4);
		String expected = "-2";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest8_4_Neg8() {
		RationalNumber rn = new RationalNumber(4, -8);
		String expected = "-1/2";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest9_Neg4_8() {
		RationalNumber rn = new RationalNumber(-4, 8);
		String expected = "-1/2";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest10_Neg4_Neg4() {
		RationalNumber rn = new RationalNumber(-4, -4);
		String expected = "1";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void ctorTest11_4_1() {
		RationalNumber rn = new RationalNumber(4, 1);
		String expected = "4";
		String actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void asNumberTest1_4_7() {
		RationalNumber rn = new RationalNumber(4, 7);
		double expected, actual;
		expected = 0.5714285714285714;
		actual = rn.asNumber();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void asNumberTest2_7_4() {
		RationalNumber rn = new RationalNumber(7, 4);
		double expected, actual;
		expected = 1.75;
		actual = rn.asNumber();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void asNumberTest3_4_1() {
		RationalNumber rn = new RationalNumber(4, 1);
		double expected, actual;
		expected = 4;
		actual = rn.asNumber();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void asNumberTest4_5_N2() {
		RationalNumber rn = new RationalNumber(5, -2);
		double expected, actual;
		expected = -2.5;
		actual = rn.asNumber();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void asNumberTest5_N5_N2() {
		RationalNumber rn = new RationalNumber(-5, -2);
		double expected, actual;
		expected = 2.5;
		actual = rn.asNumber();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void addTest1() {
		// 3/4 & 2/3 = 17/12
		RationalNumber rn = new RationalNumber(3, 4);
		rn.add(2, 3);
		String actual, expected;
		expected = "17/12";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest2() {
		// 3/4 & 2 = 11/4
		RationalNumber rn = new RationalNumber(3, 4);
		rn.add(2);
		String actual, expected;
		expected = "11/4";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest3() {
		// 2 & 5/4 = 13/4
		RationalNumber rn = new RationalNumber(2);
		rn.add(5, 4);
		String actual, expected;
		expected = "13/4";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest4() {
		// -3/4 & -2/5 = -23/20
		RationalNumber rn = new RationalNumber(-3, 4);
		rn.add(-2, 5);
		String actual, expected;
		expected = "-23/20";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest5() {
		// -3/4 & 2/5 = -7/20
		RationalNumber rn = new RationalNumber(-3, 4);
		rn.add(2, 5);
		String actual, expected;
		expected = "-7/20";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest6() {
		// 3/-4 & 5/-2 = -13/4
		RationalNumber rn = new RationalNumber(3, -4);
		rn.add(5, -2);
		String actual, expected;
		expected = "-13/4";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest7() {
		// 96/100 & '2 & -100' = 47/50
		RationalNumber rn = new RationalNumber(96, 100);
		rn.add(2, -100);
		String actual, expected;
		expected = "47/50";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest8() {
		// '2 & -100' & 96/100 = 47/50
		RationalNumber rn = new RationalNumber(2, -100);
		rn.add(96, 100);
		String actual, expected;
		expected = "47/50";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest9() {
		// 96/100 & '-3' = -51/25
		RationalNumber rn = new RationalNumber(96, 100);
		rn.add(-3);
		String actual, expected;
		expected = "-51/25";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

	@Test
	public void addTest10() {
		// 140/100 & '20/80'
		RationalNumber rn = new RationalNumber(140, 100);
		rn.add(20, 80);
		String actual, expected;
		expected = "33/20";
		actual = rn.asString();
		assertEquals(expected, actual);
	}

}
