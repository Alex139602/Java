package Starter;

import java.awt.Color;
import java.awt.Point;

public class Shape {
    
	private Color colour;
	private Point position;
	
    public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public Color getColour() {
      return colour;
    
    }
	public void setColour(Color colour) {
		this.colour = colour;
	}
	public void printCharacteristics() {
		System.out.printf("Type: %s\nColour: %s\nPoint: %s\n", getClassNameOnly(), getColour(), getPosition() );
	}
	
	public String getClassNameOnly(){
		String fullname = this.getClass().getName();
		String[] parts = fullname.split("\\.");
		return parts[parts.length - 1];
	}
	
	

  } // end of class
