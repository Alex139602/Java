package starter.Cars;

public class Program {

	public static void main(String[] args) {

		Car[] cars = { 
				new Car("Ford"), 
				new Car("Skoda"),
				new RacingCar("Mercedes", "Hamilton", 7),
				new RacingCar("Ferrari", "Alonso", 6) 
				};

		processCars(cars);

		System.out.println();

	}

	static void processCars(Car[] cars) {
		for (Car c : cars) {
			c.getToSixty();
			c.accelerate(2);
			String info = String.format("This car is a %s and current speed is %d", c.getModel(), c.getSpeed());
			
			if (c instanceof RacingCar) {
				RacingCar rc = (RacingCar) c;
				info = String.format("This car is a %s and current speed is %d, This car's driver is: %s", rc.getModel(), rc.getSpeed(), rc.getModel() );
			}
			
			System.out.println(info);
		}
	}
} // end of class
