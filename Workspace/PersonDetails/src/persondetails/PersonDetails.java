package persondetails;

public class PersonDetails {
	
	String forename, surname, ni, gender;
	int age;
	
	public PersonDetails(String forename, String surname, String ni, String gender, int age){
		this.forename = forename;
		this.surname = surname;
		this.ni = ni;
		this.gender = gender;
		this.age = age;
		
	}
	
	public PersonDetails(){
		
	}

	public boolean isMale() {
		if( this.gender.equalsIgnoreCase("Male") || this.gender.equalsIgnoreCase("M") ){
			return true;
		} else {
			return false;
		}
	
	}
	
	public void displayUserDetails(){
		System.out.printf("Forename: %s\tSurname: %s\tAge: %d\tNINO: %s\tGender: %s", this.forename, this.surname, this.age, this.ni, this.gender);
		System.out.println();
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNi() {
		return ni;
	}

	public void setNi(String ni) {
		this.ni = ni;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}
