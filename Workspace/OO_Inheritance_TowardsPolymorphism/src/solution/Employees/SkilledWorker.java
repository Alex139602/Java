package Solution.Employees;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	private ArrayList<String> skills = new ArrayList<>();

	public SkilledWorker(String name, String jobTitle){
		super(name,jobTitle);
	}
	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkill(String skill) {
		skills.add(skill);
	}

	
	public void showInfo() {
		
		super.showInfo();
		System.out.println("Employee has the following skills");
		for(String s : skills){
			System.out.println("\t" + s);
		}
	}
}
