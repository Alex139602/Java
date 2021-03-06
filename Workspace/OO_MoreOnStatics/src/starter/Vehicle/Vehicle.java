package starter.Vehicle;

import starter.FactoryStuff.RegistrationPlate;
import starter.FactoryStuff.RegistrationPlateFactory;

public class Vehicle {
	private int speed, lane;
	private RegistrationPlate reg;
	private static int count;
	public static int getCount(){
		return count;
	}
	
	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		++count;
		this.setReg(RegistrationPlateFactory.produceNextRegistrationPlate());
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
		return String.format("Speed: %d , Lane: %d , Reg : %s", speed, lane, this.getRegistrationPlate() );
	}

	public String getRegistrationPlate() {
		return getReg().toString();
	}

	public RegistrationPlate getReg() {
		return reg;
	}

	public void setReg(RegistrationPlate reg) {
		this.reg = reg;
	}
}
