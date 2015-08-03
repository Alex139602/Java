package Solution.Main;

import Solution.FactoryStuff.NoMorePlatesException;
import Solution.Vehicle.*;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		System.out.printf("Vehicle Count = %d\n\n",Vehicle.getCount());
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			try {
				vehicles.add(new Vehicle(10+i, i%3 + 1));
		    }
			catch(NoMorePlatesException e) {
				System.err.println("No more plates");
				break;
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle v = vehicles.get(i);
			if (i % 2 == 0) {
				v.accelerate(5);
			}
			else {
				v.brake(5);
			}
		}
		
		for (int i = 0; i < vehicles.size(); i++) {
			
			String data = vehicles.get(i).getDetails();
			String[] parts = data.split(",");
			String details = String.format(" Speed: %s Lane: %s Registration: %s ",parts[0],parts[1],parts[2]);
			System.out.printf("Vehicle%d\n", i+1);
			System.out.println(details);
		}
		
		System.out.printf("\nVehicle Count = %d\n\n",Vehicle.getCount());

	}

}
