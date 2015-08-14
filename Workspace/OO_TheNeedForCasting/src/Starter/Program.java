package Starter;

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

         Sphere ball = new Sphere();
         ball.setColour(Color.BLUE);
         ball.setPosition(new Point(6, 6));
         ball.setRadius(25.55);
         
         Shape shapes[] = {blob, hoop, ball};
         System.out.println("----------------");
         for (Shape shape : shapes) {
        	
			shape.printCharacteristics();
			System.out.println("----------------");
         }
         
         System.out.println("-------------- Areas --------------");

         for (Shape shape : shapes) {
			printArea(shape);
		}
	}
	
	public static void printArea(Shape sh){
		System.out.println("Name: " + sh.getClassNameOnly() );
		if ( sh instanceof Circle ) {
			Circle c = (Circle) sh;
			System.out.println("Area: " + c.getArea());
		} else {
			System.out.println("This isnt a circle! no area printing");
		}
	}

}
