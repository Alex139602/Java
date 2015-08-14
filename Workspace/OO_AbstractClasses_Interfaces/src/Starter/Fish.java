package Starter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fish implements IConsumable, IInsurable {
	
	private String name;

	public String getName() {
		return name;
	}

	public Fish(String name) {
		this.name = name;
	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": Main Course (True)";
	}

	public String getPremium() {
		return getName() + ": " + "10 pounds";
	}

	public String expires() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Date date = new Date();
		return getName() + ": " + dateFormat.format(date);
	}

	@Override
	public String describeTaste() {
		return getName() + ": Quite Fishy";
	}

}
