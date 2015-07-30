package Solution;

class Sphere extends Circle {
	
	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(getRadius(), 3);
	}

	public void printCharacteristics() {
		System.out.printf("\nSphere Characteristics\n");
		System.out.printf("----------------------\n");
		System.out.printf("Colour:        %s\n", getColour());
		System.out.printf("Position:      %s\n", getPosition());
		System.out.printf("Radius:        %f\n", getRadius());
		System.out.printf("Diameter:      %f\n", getDiameter());
		System.out.printf("Circumference: %7.2f\n", getCircumference());
		System.out.printf("Area:          %7.2f\n", getArea());
		System.out.printf("Volume:        %7.2f\n", getVolume());
		System.out.println();
	}
}
