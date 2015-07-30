package Starter.NaturalSort;

public class Person {

    private int age;
	private String name;
	
    public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return String.format("%10s\t%d", getName(), getAge());
    }

    
  
}
