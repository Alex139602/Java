package Solution.Vehicle;

import Solution.FactoryStuff.*;

public class Vehicle {
	private int speed, lane;
	private static int count;
	private RegistrationPlate registration;

	public Vehicle(int speed, int lane) throws NoMorePlatesException{
		this.speed = speed;
		this.lane = lane;
		
		registration = RegistrationPlateFactory.produceNextRegistrationPlate();
		count++;
		
		
	}

	public static int getCount() {
		return count;
	}

	public void accelerate(int amt) {
		speed += amt;
		if (speed > 70) {
			speed = 70;
		}
	}

	public void brake(int amt) {
		speed -= amt;
		if (speed < 0) {
			speed = 0;
		}
	}


	public String getDetails() {
		return String.format("%d,%d,%s", speed, lane,
				registration.getRegistrationNo());
	}
}
