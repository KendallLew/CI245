package Cis245_Java2;

public class TestHierarchy {

	public static void main(String[] args) {
		Person person = new Person("Joe");
		StudentextendsPerson student = new StudentextendsPerson ("Bob", null);
		EmployeeextendsPerson employee = new EmployeeextendsPerson("Sha");
		FacultyextendsEmployee faculty = new FacultyextendsEmployee("Diana");
		StaffextendsEmployee staff = new StaffextendsEmployee("Edward");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		

	}

}
