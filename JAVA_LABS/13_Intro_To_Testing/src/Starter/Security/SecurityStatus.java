package Starter.Security;

public class SecurityStatus {
	// encapsulates these 2 fields so that logon() can
	// effectively return 2 values by returning
	// an instance of this class
	private boolean success;
	private String errMessage;

	public SecurityStatus(boolean success, String errMessage) {
		this.success = success;
		this.errMessage = errMessage;
	}

	// 2 * getters
	public boolean isSuccess() {
		return success;
	}

	public String getErrMessage() {
		return errMessage;
	}

	// 2 * setters
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

}
