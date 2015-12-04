package data;

public class Product extends AbstractProduct {
	
	private String name;
	private float price = 0;
	private int quantity = 0;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

	@Override
	public String toString() {
		return "Name: " + this.name + ", Price: " + this.price + ", Quantity: " + this.quantity ;
	}

	public Object[] toArray() throws ProductIsNotValidException {
		if(this.name != null && this.price != 0 && this.quantity != 0){
			return new Object[] { 
					this.name, 
					this.price, 
					this.quantity 
				};
		} else {
			throw new ProductIsNotValidException("Product not constructed properly, please check constructors");
		}
		
	}

	// general constructor
	public Product(String name, float price, int quantity){
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
	}
	// constructor for single object, aka quantity = 1
	public Product(String name, float price){
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(1);
	}
	
	
}
