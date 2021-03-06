package starter.Main;

import java.util.ArrayList;

import solution.FactoryStuff.RegistrationPlate;
import solution.FactoryStuff.RegistrationPlateFactory;
import starter.Vehicle.Vehicle;

public class Program {

	public static void main(String[] args) {
		// Display count
		System.out.printf("Vehicle Count : %d\n\n", Vehicle.getCount() );
		
		// Create ArrayList of Vehicle
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		// Loop to create 7 vehicles
		
		for (int i = 0; i < 7; i++) {
			int randomNum0To70 = (int) Math.floor(Math.random()*35) + 1;
			int randomNum0To3 = (int) Math.floor(Math.random()*3) + 1;
			vehicleList.add( new Vehicle( randomNum0To70, i%3 + 1 ) );
		}
		
		
		// Call accelerate or brake
		
		for ( Vehicle v : vehicleList) {
			
			int randomNum0To70 = (int) Math.floor(Math.random()*35) + 1;
			double randNum0To1 = Math.random();
			if ( randNum0To1 > 0.5 ) {
				v.accelerate(randomNum0To70);
			} else {
				v.brake(randomNum0To70);
			}
			
		}
		
		// Display details
		
		for (Vehicle vehicle : vehicleList) {
			System.out.println( vehicle.getDetails() );
		}
		
		// Display count again
		System.out.println("\n");
		System.out.printf("Vehicle Count : %d\n\n", Vehicle.getCount() );
	}

}
