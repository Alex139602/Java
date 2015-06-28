package Starter.Security;

public class Security {

	// returns a 'SecurityStatus' object comprising a
	// boolean representing success and a String errorMessage.
	public SecurityStatus logon(String userId, String password) {

		SecurityStatus ss = new SecurityStatus(true, "");

		// validation will happen here

		return ss;
	}

	
	
	// helper method here to check password contents

}
