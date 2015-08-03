package Solution.FactoryStuff;

public class RegistrationPlateFactory {
	private static String[] regPlates 
	  = { "MRB1G", "RU16", "TOYS4US", "HNZ57", "PUT3", "JB007" };

	private static int nextAvailablePlate = 0;

	public static RegistrationPlate produceNextRegistrationPlate() 
		throws NoMorePlatesException
	{
		if (nextAvailablePlate < regPlates.length) {
			String reg = regPlates[nextAvailablePlate];
			RegistrationPlate rp = new RegistrationPlate(reg);
			nextAvailablePlate++;
			return rp;
			// or
			// return new RegistrationPlate(regPlates[nextAvailablePlate++]);
		} else {
			//return new RegistrationPlate("XXXX");
			throw new NoMorePlatesException();
		}

	}
}
