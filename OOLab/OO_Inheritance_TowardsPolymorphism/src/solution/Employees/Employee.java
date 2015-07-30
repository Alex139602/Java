package Solution.Employees;

public class Employee {
	private String name;
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	private String jobTitle;
	public String getJobTitle() {
		return jobTitle;
	}
	private void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	private int id;
	private void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	protected static int idCount;
	public void generateId() {
		 setId(++Employee.idCount * 10);
	}
	
	public Employee(String name, String jobTitle ) {
		generateId();
		setName(name);
		setJobTitle(jobTitle);
		
	}
	
	public void showInfo() {
		System.out.println("\n**** *****");
		
		System.out.printf("Name: %s\n", getName());
        System.out.printf("Job Title: %s\n", getJobTitle());
        System.out.printf("Employee ID: %d\n", getId());		
	}
}
