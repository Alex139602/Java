package Starter.Security;

public class Security {

	// returns a 'SecurityStatus' object comprising a
	// boolean representing success and a String errorMessage.
	
	public Security(){
		
	}
	
	public SecurityStatus login(String userId, String password) {

		SecurityStatus sS = new SecurityStatus(true, "");
		
		
		// validation will happen here

		return sS;
	}

	
	
	// helper method here to check password contents
	public void validLogon(String userId, String Password){
		
	}
}