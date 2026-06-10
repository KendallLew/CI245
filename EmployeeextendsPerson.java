package Cis245_Java2;

public class EmployeeextendsPerson {
	protected String office;
	protected double salary;
	protected MyDate dateHired;
	private String name;
	
	public EmployeeextendsPerson(String name) {
		super();
		this.dateHired = new MyDate();
	}
	
	@Override
	public String toString() {
		return "Class: Employee, Name: " + name;
		
	}


}
