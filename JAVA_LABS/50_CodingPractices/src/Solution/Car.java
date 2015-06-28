package Solution;

public class Car {
	
	private double fuelEfficiency;
	private double petrol;
	
	// ctor stores efficiency
	public Car(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	// receives miles, use fuel, reduces petrol
	public void drive(int miles) {
		petrol -= miles/fuelEfficiency;
	}
	// increase fuel levels
	public void addPetrol(double amt) {
		petrol += amt;
	}
	// exposes remaining fuel
	public double getPetrolInTank() {
		return petrol;
	}
	

}
