package Solution;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	public String isMainCourseDish() {
		return getName() + ": " + false;
	}

	public String describeTaste() {
		return getName() + ": " + "Chocolaty";
	}

}
