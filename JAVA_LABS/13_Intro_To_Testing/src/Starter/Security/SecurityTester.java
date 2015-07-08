package Starter.Security;

import static org.junit.Assert.*; // Arrange, Act, Assert

import org.junit.Test;

public class SecurityTester {

	@Test
	public void testLoginEmptyUserId() {
		// Arrange
		String userId = "";
		String password = "Fred34";
		
		// Act
		Security secr = new Security();
		SecurityStatus sS = secr.login(userId, password);
		
		boolean expected = false;
		boolean actual = sS.isSuccess();
		
		// Assert
		String passInfo = String.format("Invalid Login. Logins are \t User -- %s\tPassword -- %s \t", userId, password);
		assertEquals(passInfo, expected, actual);
	}
	
	@Test
	public void testLoginNullUserId() {
		// Arrange
		String userId = null;
		String password = "Fred34";
		
		// Act
		Security secr = new Security();
		SecurityStatus sS = secr.login(userId, password);
		
		boolean expected = false;
		boolean actual = sS.isSuccess();
		
		// Assert
		String passInfo = String.format("Invalid Login. Logins are \t User -- %s\tPassword -- %s \t", userId, password);
		assertEquals(passInfo, expected, actual);
	}
	
	@Test
	public void testLoginEmptyPassword() {
		// Arrange
		String userId = "Fred";
		String password = "";
		
		// Act
		Security secr = new Security();
		SecurityStatus sS = secr.login(userId, password);
		
		boolean expected = false;
		boolean actual = sS.isSuccess();
		
		// Assert
		String passInfo = String.format("Invalid Login. Logins are \t User -- %s\tPassword -- %s \t", userId, password);
		assertEquals(passInfo, expected, actual);
	}
	
	@Test
	public void testLoginNullPassword() {
		// Arrange
		String userId = "";
		String password = null;
		
		// Act
		Security secr = new Security();
		SecurityStatus sS = secr.login(userId, password);
		
		boolean expected = false;
		boolean actual = sS.isSuccess();
		
		// Assert
		String passInfo = String.format("Invalid Login. Logins are \t User -- %s\tPassword -- %s \t", userId, password);
		assertEquals(passInfo, expected, actual);
	}

}
