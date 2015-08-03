package Solution;

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
		//System.out.printf("This is a %s\n", getClass().getName());
		
		// enhancement
		System.out.printf("This is a %s\n", getClassNameOnly());
		System.out.printf("Colour:        %s\n", getColour());
		System.out.printf("Position:      %s\n", getPosition());
		// enhancement
		if (this.getClassNameOnly().equals("Shape")) {
			System.out.println();
		}
		
	}
	// enhancement method to get ClassName only
	public String getClassNameOnly() {
		String fullname = this.getClass().getName();
		// "\." is what is sent to split meaning
		// really treat '.' as a separator.
		String[] parts = fullname.split("\\."); 
		return parts[parts.length - 1];
	}

  }
