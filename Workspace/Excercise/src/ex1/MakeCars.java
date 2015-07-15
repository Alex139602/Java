package ex1;

import ex1.Car;

public class MakeCars {

	public static void main(String[] args) {
		Car BMW = new Car("Red", "BMW", "M3", 4);
		BMW.getUser();
		System.out.println(BMW.toString());
		BMW.setColor("Black");
		BMW.setModel("M5");
		BMW.setAge(7);
		System.out.println("\n" + BMW.toString());

	}

}
