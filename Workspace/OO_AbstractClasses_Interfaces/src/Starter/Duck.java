package Starter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Duck extends Bird implements IInsurable {
	
	
	public Duck(String name) {
		super(name);
	}

	@Override
	public String describeTaste() {
		return getName() + ": Quack Quack";
	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": Main Course (True)";
	}

	@Override
	public String expires() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Date date = new Date();
		return getName() + ": " + dateFormat.format(date);
	}
	
	@Override
	public String getPremium(){
		return getName() + ": 30 Pounds";
	}
	

}
