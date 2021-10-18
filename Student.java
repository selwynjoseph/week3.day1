package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("student name is selwyn joseph");
	}
	
	public void studentDept()
	{
		System.out.println("Student department is ME");
	}
	
	public void studentId()
	{
		System.out.println("Student id is 1002201");
	}
	
	public static void main(String[] args) {

		College c=new College();
		Department d=new Department();
		Student s=new Student();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		d.deptName();
		
		s.studentName();
		s.studentDept();
		s.studentId();
		

	}

	
	
	
}
