package starter.FactoryStuff;

public class RegistrationPlateFactory {
	private static String[] regPlates = { "MRB1G", "RU16", "TOYS4US", "HNZ57","PUT3", "JB007" };

	private static int nextAvailablePlate = 0;
	
	public static RegistrationPlate produceNextRegistrationPlate() {
			if ( nextAvailablePlate < regPlates.length ) {
				RegistrationPlate regPlate = new RegistrationPlate( regPlates[nextAvailablePlate] );
				nextAvailablePlate++;
				return regPlate;
			}
		return new RegistrationPlate("XXXXX");
	}
	

}
