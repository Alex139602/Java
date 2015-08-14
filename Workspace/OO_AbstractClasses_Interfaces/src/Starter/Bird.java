package Starter;

public abstract class Bird implements IConsumable {

	private String name;

	public String getName() {
		return name;
	}

	public Bird(String name) {
		this.name = name;
	}


}
