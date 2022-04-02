package week3.day1.assignments;

public class Students {
	
	static int studentId;
	
	public Students() {
		studentId = 101;
	}

	public void getStudentsInfo() {
		System.out.println("Students Info");
	}
	
	public void getStudentsInfo(int id) {
		System.out.println("Students Info - Id: " + id);
	}
	
	public void getStudentsInfo(int id, String name) {
		System.out.println("Students Info - Id: " + id + " & Name: " + name);
	}
	
	public void getStudentsInfo(String email, long phoneNumber) {
		System.out.println("Students Info - Email: " + email + " & Phone number: " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentsInfo();
		students.getStudentsInfo(studentId);
		students.getStudentsInfo(studentId, "Feros");
		students.getStudentsInfo("feros@testleaf.com", 9710626060l);
	}
}
