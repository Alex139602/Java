package starter.FactoryStuff;

public class RegistrationPlate {
    public final int width = 20;
    public final int height = 8;
    private String registrationNo; 
    
    public RegistrationPlate(String regNo){
    	this.setRegistrationNo(regNo);
    }

	public String getRegistrationNo() {
		return registrationNo;
	}

	private void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	
	public String toString(){
		return registrationNo;
	}
    
}
