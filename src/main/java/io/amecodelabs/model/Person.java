package io.amecodelabs.model;

public class Person {
	private String names;
	private String lastNames;
	
	public static Person createPersonDefault() {
		return new Person("Joe", "Doe");
	}
	
	public static Person createPerson(String names, String lastNames) {
		return new Person(names, lastNames);
	}
	
	private Person(String names, String lastNames) {
		this.names = names;
		this.lastNames = lastNames;
	}
	
	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}
	
}
