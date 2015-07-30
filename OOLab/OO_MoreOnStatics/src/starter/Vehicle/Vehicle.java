package Starter.Vehicle;


public class Vehicle {
	private int speed, lane;

	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
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
		return String.format("%d,%d", speed, lane);
	}
}
