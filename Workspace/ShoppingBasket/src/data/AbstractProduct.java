package data;

public abstract class AbstractProduct {
	
	private String name;
	private double price;
	private int quantity;
	
	public double newThing(){
		return this.price * 4;
	}

}
