package Starter.Volume;

public class Volume {
	// fields to hold the class' data
	private int gallons;
	private int pints;
	private boolean validVolume;

	public int getGallons() {
		return gallons;
	}

	public int getPints() {
		return pints;
	}

	public boolean getValidVolume() {
		return validVolume;
	}

	// return true if parameters represent a valid volume
	public boolean validate(int gallons, int pints) {
		if (gallons >= 0 && ( pints >=0 && pints < 8 ) ) {
			return true;
		} else {
			return false;
		}
	}

	// returns the current volume formatted as a String
	public String getCurrentVolume() {
		return this.gallons + ", " + this.pints;
	}
	
	public Volume(int gallons, int pints) {
		this.gallons = gallons;
		this.pints = pints;
	}
	
	// Add parameters representing gallons and pints to the
	// encapsulated data
	public void addVolume(int gallons, int pints) {
		if ( validate(gallons, pints) ) {
			int totalPints = this.gallons*8 + gallons*8 + this.pints + pints;
			
			int totalPintsRemainder = totalPints % 8;
			
		} else {
			System.out.println("Invalid addition");
		}

	}

	// Subtract parameters representing gallons and pints from the
	// encapsulated data
	public void subtractVolume(int gallons, int pints) {
		
	}

	public int convertToPints(int gallons, int pints) {
		return gallons*8 + pints;
	}
}
