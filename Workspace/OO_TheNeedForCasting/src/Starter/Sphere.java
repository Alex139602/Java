package Starter;

class Sphere extends Circle {
	
	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(getRadius(), 3);
	}
	
	public double getSurfaceArea(){
		return super.getArea() * 4;
	}
	
	@Override public double getArea(){
		return 4 * super.getArea();
	}

	public void printCharacteristics() {
		super.printCharacteristics();
		if (this instanceof Sphere) {
			System.out.printf("Volume: %f\nSurface Area: %f\n", getVolume(), getSurfaceArea() );
		}
	}
}
