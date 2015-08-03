package Solution;

public abstract class Bird implements Consumable {

	private String name;

	public String getName() {
		return name;
	}

	public Bird(String name) {
		this.name = name;
	}

	public String describeTaste() {
		return getName() + ": " + "Delicate";
	}

	public String isMainCourseDish() {
		return getName() + ": " + true;
	}
}
