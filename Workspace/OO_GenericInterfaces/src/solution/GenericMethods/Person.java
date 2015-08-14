package solution.GenericMethods;

import java.util.*;



public class Person implements Comparable<Person> {

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


    public static final Comparator<Person> ByName = new PersonNameComparer();
    private static class PersonNameComparer implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public int compareTo(Person other) {
        return this.getAge() - other.getAge();
    }
}
