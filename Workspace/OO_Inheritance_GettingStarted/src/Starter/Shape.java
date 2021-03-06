package Starter;

import java.awt.Color;
import java.awt.Point;

public class Shape {
	
	public Color color;
	public Point point;
	
	public Shape() {
		this.setColor(Color.WHITE);
		this.setPoint(0,0);
	}
	
	public String getColor() {
		return String.format("Color: R-%s G-%s B-%s" , color.getRed(), color.getGreen(), color.getBlue());
	}

	public String getPoint() {
		return String.format("Point:	x = %s, y = %s", this.point.x, this.point.y );
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	public void setPoint(int i, int j) {
		this.point = new Point();
		this.point.x = i;
		this.point.y = j;
	}
	

} // end of class
