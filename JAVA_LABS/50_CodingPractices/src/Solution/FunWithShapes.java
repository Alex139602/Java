package Solution;

import java.util.Scanner;

public class FunWithShapes {

	public static void main(String[] args) {
		System.out
				.println("Choose '1'-Circle, '2'-Triangle, '3'-Square or '4'-Rectangle");
		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		if (answer < 0 || answer > 4) {
			System.out.println("Must be 1 thru 4!! - try again");
			return;
		}
		if (answer == 1) {
			circleProcessing(s);
		}
		else if (answer == 2) {
			triangleProcessing(s);
		}
		else if (answer == 3) {
			squareProcessing(s);
		}
		else if (answer == 4) {
			rectangleProcessing(s);
		}
	}


	private static void circleProcessing(Scanner sc) {
		double area, perimeter;

		double radius = getDouble("Please enter the Circle's radius", sc);

		if (radius <= 0) {
			System.out.println("Must a positive numeric value");
			return;
		}
		perimeter = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;

		displayPerimeterAndArea(perimeter, area);

	}

	private static void triangleProcessing(Scanner sc) {
		double area, perimeter;
		double a, b, c;

		a = getDouble("Please enter the length of side 1", sc);
		b = getDouble("Please enter the length of side 2", sc);
		c = getDouble("Please enter the length of side 3", sc);

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("All 3 values must be positive numeric values");
			return;
		}
		if (sideLengthsMakeSense(a, b, c)) {
			perimeter = a + b + c;
			double s = perimeter / 2;

			area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

			displayPerimeterAndArea(perimeter, area);
		}
		else {
			System.out.println("Side lengths don't make sense");
			System.out
					.println("Sum of any 2 sides must be less than length of third");
		}
	}

	private static void displayPerimeterAndArea(double perimeter, double area) {
		System.out.printf("Perimeter: %.2f\n", perimeter);
		System.out.printf("Area:      %.2f\n", area);
	}

	private static boolean sideLengthsMakeSense(double a, double b, double c) {
		if (a + b <= c)
			return false;

		if (a + c <= b)
			return false;

		if (b + c <= a)
			return false;

		return true;
	}

	private static double getDouble(String message, Scanner s) {
		System.out.println(message);
		return s.nextDouble();
	}
	
	private static void squareProcessing(Scanner sc) {

		double area, perimeter;

		double sideLength = getDouble("Please enter the length of each side",
				sc);

		if (sideLength <= 0) {
			System.out.println("Must a positive numeric value");
			return;
		}
		perimeter = fourSidedPerimeter(sideLength,  sideLength);
		area = fourSidedArea(sideLength,  sideLength);

		displayPerimeterAndArea(perimeter, area);
	}

	private static void rectangleProcessing(Scanner sc) {
		double area, perimeter;

		double width = getDouble("Please enter the width", sc);
		double height = getDouble("Please enter the height", sc);
		if (width <= 0 || height <= 0) {
			System.out.println("Must be positive numeric values");
			return;
		}
		perimeter = fourSidedPerimeter(width, height);
		area = fourSidedArea(width, height);

		displayPerimeterAndArea(perimeter, area);

	}

	private static double fourSidedPerimeter(double d1, double d2) {
		return (d1 + d2) * 2;
	}

	private static double fourSidedArea(double d1, double d2) {
		return d1 * d2;
	}
}
