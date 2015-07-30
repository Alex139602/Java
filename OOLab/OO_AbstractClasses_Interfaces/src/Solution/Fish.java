package Solution;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fish implements Consumable, Insurable {

	private String name;

	public String getName() {
		return name;
	}

	public Fish(String name) {
		this.name = name;
	}

	public String describeTaste() {
		return getName() + ": Quite fishy";
	}

	public String isMainCourseDish() {
		return getName() + ": True";
	}

	public String getPremium() {
		return getName() + ": " + "10 pounds";
	}

	public String expires() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Date date = new Date();
		return getName() + ": " + dateFormat.format(date);
	}
}
