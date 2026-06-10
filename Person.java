package Cis245_Java2;

public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddress;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { 
		return "Class: Person, Name: " + name;
		
	}

}
