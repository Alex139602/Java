package starter.Employees;

public class Employee {
	
	public Employee(String name, String jobTitle ) {
		setName(name);
		setJobTitle(jobTitle);
		generateId();
	}
	
	private String name;	
	public String getName() {
		return name;
	}



	public String getJobTitle() {
		return jobTitle;
	}
	
	public int getId() {
		return this.id;
	}
	
	private void setId(int id){
		this.id = id;
	}

	public static int getIdCount() {
		return idCount;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	private void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	private String jobTitle;	
	private int id;

	protected static int idCount;
	public void generateId() {
		setId(++idCount * 10);
	}
	
	public String showInfo() {
		return String.format("Name: %s\t Job Title: %s\t Employee ID: %d", getName(), getJobTitle(), getId());
	}
} // end of class
