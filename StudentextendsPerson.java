package Cis245_Java2;

public class StudentextendsPerson {
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	private String status;
	private String name;
	
	public StudentextendsPerson(String name, String status) {
		super();
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Class: Student, Name: " + name;
		
	}

}
