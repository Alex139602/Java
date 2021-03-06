package ex1;

public class Car {
	
	private String color;
	private String make;
	private String model;
	private int age;
	public String userID; 
	
	// each class has a public method called constructor which is named with the class name.
	
	public Car(String c, String ma, String mo, int a) {
		color = c;
		make = ma;
		model = mo;
		age = a;
	}

	public String toString() {
		return "Color: " + getColor() + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nAge: " + getAge();
	}
	
	public int getAge() {
		return age;
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public String getColor() {
		return color;
	}
	
	public String getUser() {
		return Utilities.getInput("Who Are You?");
	}
	
	public void setUser(String user){
		user = userID;
	}

	public boolean identify(String user) {
		if(user.equalsIgnoreCase(userID)){
			return true;
		} else {
			return false;
		}
	}

	public void setColor(String c){
		if (identify(userID)) {
		color = c;
		} else { 
			System.out.println("intruder"); 
			System.exit(0); 
		}
	}
	
	public void setModelNoCheck(String mo){
		model = mo;
	}

	public void setMake(String ma){
		if (identify(userID)) {
		make = ma;
		} else { 
			System.out.println("intruder"); 
			System.exit(0); 
		}
	}
	
	public void setModel(String mo){
		if (identify(userID)) {
		model = mo;
		} else { 
			System.out.println("intruder"); 
			System.exit(0); 
		}
	}
	
	public void setAge(int a){
		if (identify(userID)) {
		age = a;
		} else { 
			System.out.println("intruder"); 
			System.exit(0); 
		}
	}







} // end of class
