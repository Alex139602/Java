package Starter;

class Circle extends Shape
{
    private double radius;

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        if (r >= 0)  {
        	radius = r;
        }       
    }

    public double getDiameter() {
            return radius * 2;       
    }

    public double getCircumference()  {
        return 2 * Math.PI * radius;       
    }

    public double getArea() {       
            return Math.PI * radius * radius;   
    }

    public void printCharacteristics() {
    	super.printCharacteristics();
    	System.out.printf("Radius: %f\nDiameter: %f\n", getRadius(), getDiameter() );
    	if (this instanceof Circle) {
			System.out.printf("Circumference: %f\nArea: %f\n", getCircumference(), getArea() );
		}
    }

    
    
    

}
