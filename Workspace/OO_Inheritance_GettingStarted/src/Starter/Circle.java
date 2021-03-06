package Starter;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0 ) {
			this.radius = radius;	
		}
	}
	
	public double getCircumference(){
		return 2 * Math.PI * this.radius;
	}
	
	public double getArea(){
		return Math.PI * this.radius * this.radius;
	}
	
	
	
	
} // end of class
