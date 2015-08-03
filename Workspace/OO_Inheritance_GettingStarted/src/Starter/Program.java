package Starter;

import java.awt.Color;

public class Program {

	public static void main(String[] args) {

         Shape blob = new Shape();
         
         blob.setColor(Color.GREEN);
         blob.setPoint(1, 3);


 		System.out.printf("\nShape Characteristics\n");
 		System.out.printf("----------------------\n");
 		System.out.printf( blob.getColor() + "\n");
 		System.out.printf( blob.getPoint() + "\n");
 		
 		Circle hoop = new Circle(4);
 		
 		System.out.printf("\nCircle Characteristics\n");
 		System.out.printf("----------------------\n");
 		System.out.printf("Colour:        %s\n", hoop.getColor());
 		System.out.printf("Position:      %s\n", hoop.getPoint());
 	
 		
 		System.out.println();

	}

}
