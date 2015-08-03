package starter.Employees;

import java.util.ArrayList;

public class Manager extends Employee {
	
	public ArrayList<Employee> employees = new ArrayList<>();
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}

	public Manager(String name, String jobTitle, ArrayList<Employee> employees) {
		super(name, jobTitle);
		
	}
	
	
	
}
