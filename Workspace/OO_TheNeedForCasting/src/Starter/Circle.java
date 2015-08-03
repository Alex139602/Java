package Starter;

class Circle extends Shape
{
    private double radius;

    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double r)
    {
            if (r >= 0)
            {
                radius = r;
            }       
    }

    public double getDiameter()
    {
            return radius * 2;       
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;       
    }

    public double getArea()
    {       
            return Math.PI * radius * radius;   
    }

    public void printCharacteristics()
    {
        System.out.printf("Circle Characteristics\n");
        System.out.printf("----------------------\n");
        System.out.printf("Colour:        %s\n", getColour());
        System.out.printf("Position:      %s\n", getPosition());
        System.out.printf("Radius:        %f\n", getRadius());
        System.out.printf("Diameter:      %f\n", getDiameter());
        System.out.printf("Circumference: %7.2f\n", getCircumference());
        System.out.printf("Area:          %7.2f\n", getArea());
        System.out.println();
    }

    
    
    

}
