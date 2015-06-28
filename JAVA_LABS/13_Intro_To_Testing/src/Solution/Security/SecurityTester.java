package Solution.Security;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecurityTester {

	@Test
	public void testLogonEmptyUserId() {
		String userId = "";
		String password = "Fred34";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonNullUserId() {
		String userId = null;
		String password = "Fred34";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonEmptyPassword() {
		String userId = "Fred";
		String password = "";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonNullPassword() {
		String userId = "Fred";
		String password = null;
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonUserIDAllSpaces() {
		String userId = "  ";
		String password = "Fred34";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonPasswordAllSpaces() {
		String userId = "Fred";
		String password = "    ";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonGoodCombination() {
		String userId = "Fred";
		String password = "Frederic34";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = true;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonPasswordTooShort() {
		String userId = "Fred";
		String password = "Fred34";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonPasswordNoUpper() {
		String userId = "Fred";
		String password = "freddie34";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}

	@Test
	public void testLogonPasswordNoDigit() {
		String userId = "Fred";
		String password = "Frederic";
		Security s = new Security();
		SecurityStatus ss = s.logon(userId, password);
		boolean expected = false;
		boolean actual = ss.isSuccess();
		assertEquals(ss.getErrMessage(), expected, actual);
	}
}
