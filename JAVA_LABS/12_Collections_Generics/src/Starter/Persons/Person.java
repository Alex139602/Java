package Starter.Persons;

import java.io.PrintStream;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDetails() {
		return String.format("%s\t is %d years old", name, age);
	}
	
	public String toString() {
		return String.format("\tName: %s\tAge: %d", this.name, this.age);
	}

}
