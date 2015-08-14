package Starter;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);	
	}

	@Override
	public String describeTaste() {
		return getName() + ": Chocolatey";
	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": Main Course (False)";
	}

}
