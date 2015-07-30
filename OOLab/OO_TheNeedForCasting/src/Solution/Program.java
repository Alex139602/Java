package Solution;

import java.awt.Color;
import java.awt.Point;

public class Program {

	public static void main(String[] args) {
		 Shape blob = new Shape();
         blob.setColour(Color.GREEN);
         blob.setPosition(new Point(1, 3));

         Circle hoop = new Circle();
         hoop.setColour(Color.RED);
         hoop.setPosition(new Point(3, 4));
         hoop.setRadius(25.55);
         //hoop.printCharacteristics();

         Sphere ball = new Sphere();
         ball.setColour(Color.BLUE);
         ball.setPosition(new Point(6, 6));
         ball.setRadius(25.55);
         //ball.printCharacteristics();
         
         Shape[] shapes = {blob, hoop, ball};
         for (Shape s : shapes) {
			s.printCharacteristics();
			//System.out.println(); // removed for final enhancement
		 }
         System.out.println();
         for (Shape s : shapes) {
			printArea(s);
		 }

	}
	
	public static void printArea(Shape s) {
		if (s instanceof Circle) {
			Circle c = (Circle)s;
			System.out.printf("The area of this %s is %7.2f\n", 
					c.getClass().getName(),c.getArea());
		}
		else {
			System.out.println("Not a circle");
		}
	}

}
