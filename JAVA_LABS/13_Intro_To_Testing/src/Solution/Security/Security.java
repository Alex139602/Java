package Solution.Security;

public class Security {

	// returns a 'SecurityStatus' object comprising a
	// boolean representing success and a String errorMessage.
	public SecurityStatus logon(String userId, String password) {

		SecurityStatus ss = new SecurityStatus(false, "");

		// validation will happen here
		if (userId == null || userId.trim().equals("")) {
			ss.setErrMessage("UserID may not be null or empty");
			ss.setSuccess(false);
		}
		// no need for this to run if userId null or ""
		else if (password == null || password.trim().equals("")) {
			ss.setErrMessage("Password may not be null or empty");
			ss.setSuccess(false);
		}
		// no need for this to run if userId or password are null or ""
		else if (!validatePassword(password)) {
			ss.setErrMessage("Password must be min 8 chars with an uppercase and a number");
			ss.setSuccess(false);
		}
		else {
			ss.setSuccess(true);
		}
		// always get here!
		return ss;
	}

	// helper method to check password contents
	private boolean validatePassword(String password) {
		// start pessimistic
		boolean hasUpper = false, hasDigit = false;

		if (password.length() < 8)
			return false;

		for (char c : password.toCharArray()) {

			if (Character.isUpperCase(c)) {
				// remember we have found an upper
				hasUpper = true;
				// continue loop as no character can be both!
				continue;
			}
			if (Character.isDigit(c)) {
				// remember we found a digit
				hasDigit = true;
			}
		}
		// returns true if both are true
		return hasUpper && hasDigit;

	}
}
