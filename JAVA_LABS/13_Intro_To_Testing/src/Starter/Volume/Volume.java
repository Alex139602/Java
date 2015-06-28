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
		return true;
	}

	// returns the current volume formatted as a String
	public String getCurrentVolume() {

		return "";
	}

	// Constructor to create a volume
	public Volume(int gallons, int pints) {
		
	}

	// Add parameters representing gallons and pints to the
	// encapsulated data
	public void addVolume(int gallons2, int pints2) {


	}

	// Subtract parameters representing gallons and pints from the
	// encapsulated data
	public void subtractVolume(int gallons2, int pints2) {
		
	}

	private int convertToPints(int gallons, int pints) {
		return 0;
	}
}
