package Solution.Volume;

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
		// Check that both values are in range
		return gallons >= 0 && pints >= 0 && pints < 8;
	}

	// returns the current volume formatted as a String
	public String getCurrentVolume() {

		if (validVolume)
			return String.format("%d gallons %d pints", gallons, pints);
		else
			return "";
	}

	// Constructor to create a volume
	public Volume(int gallons, int pints) {
		this.gallons = gallons;
		this.pints = pints;
		validVolume = validate(gallons, pints);
	}

	// Add parameters representing gallons and pints to the
	// encapsulated data

	public void addVolume(int gallons2, int pints2) {
		// Can only add to a valid volume
		if (!validVolume) return;

		// check the parameters are valid as well
		if (validate(gallons2, pints2)) {
			// add the values given
			gallons += gallons2;
			pints += pints2;

			// check for overflows
			if (pints >= 8) {
				pints -= 8;
				gallons++;
			}
		}

		else {
			// Not valid - set validVolume false
			validVolume = false;
		}

	}

	// Subtract parameters representing gallons and pints from the
	// encapsulated data

	public void subtractVolume(int gallons2, int pints2) {
		// Can only subtract from a valid volume
		if (!validVolume) return;

		// check the parameters are valid as well
		if (validate(gallons2, pints2)) {
			// Test if we are going to underflow
			// if so invalid and exit
			int currentPints, incomingPints;
			currentPints = convertToPints(gallons, pints);
			incomingPints = convertToPints(gallons2, pints2);

			if (incomingPints > currentPints) {

				validVolume = false;
				return;
			}
			// not going negative so subtract the values given
			gallons -= gallons2;
			pints -= pints2;

			// check for underflow of pints
			if (pints < 0) {
				pints += 8;
				gallons--;
			}
		}
		else {
			// Not valid params - set validVolume false
			validVolume = false;
		}
	}

	private int convertToPints(int gallons, int pints) {
		return (gallons * 8) + pints;
	}
}
