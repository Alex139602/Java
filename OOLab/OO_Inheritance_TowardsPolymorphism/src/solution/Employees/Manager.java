package Solution.Employees;

import java.util.ArrayList;

public class Manager extends Employee {
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public Manager(String name, String jobTitle) {
		super(name,jobTitle);
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Manager has the following employees");
		for (Employee e : employees) {
			System.out.println("\t" + e.getName());

		}
	}
}
