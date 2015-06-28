package Solution;

public class Angle {

	private int degrees;
	private boolean validAngle;

	public int getDegrees() {
		return degrees;
	}

	public boolean getValidAngle() {
		return validAngle;
	}

	public Angle(int degrees) {
		this.degrees = degrees;
		validAngle = (degrees >= 0 && degrees < 360);
	}

	public void addAngle(int degrees2) {
		if (!validAngle) {
			return;
		}
		// angle currently valid
		if (degrees2 >= 0 && degrees2 < 360) {
			// ádd degrees
			degrees += degrees2;
			// normalise
			if (degrees >= 360) {
				degrees -= 360;
			}

		}
		else {
			// bad data make object invalid
			validAngle = false;
		}

	}

	public void subtractAngle(int degrees2) {
		if (!validAngle) {
			return;
		}
		if (degrees2 >= 0 && degrees2 < 360) {
			degrees -= degrees2;
			if (degrees < 0) {
				degrees += 360;
			}
		}
		else {
			validAngle = false;
		}
	}

	public String getCurrentAngle() {
		if (!validAngle) {
			return "Error";
		}

		switch (degrees) {
		case 0:
			return "No degrees";

		case 1:
			return "1 degree";

		default:
			return String.format("%s degrees", degrees);
		}

	}

}
