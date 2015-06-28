package Solution;

public class CarTester {

	public static void main(String[] args) {
		Car c = new Car(50);
		
		c.addPetrol(5);
		c.drive(205);
		System.out.printf("Remaining petrol is %.2f \n",c.getPetrolInTank());

	}

}
