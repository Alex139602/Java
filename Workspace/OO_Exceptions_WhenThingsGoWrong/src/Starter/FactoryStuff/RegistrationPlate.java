package Starter.FactoryStuff;

public class RegistrationPlate {
    public final int width = 20;
    public final int height = 8;
    private String registrationNo; 
    
    RegistrationPlate(String regno) {
        registrationNo = regno;
    }

	public String getRegistrationNo() {
		return registrationNo;
	}
    
}
