package week3.day1.assignments.student;

import week3.day1.assignments.department.Department;

public class Student extends Department {

	public void studentName () {
		System.out.println("Student Name");
	}
	
	public void studentDept () {
		System.out.println("Student Department");
	}
	
	public void studentId () {
		System.out.println("Student Id");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
