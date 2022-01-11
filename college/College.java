package org.college;

public class College {
String name="Jaya";
int code=1020;
int rank=1;
public void collegeName() {
	System.out.println(name);
	
}
public void collegeCode () {
	System.out.println(code);
	// TODO Auto-generated constructor stub
}
public void collegeRank() {
	System.out.println(rank);
	
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("college detail");
	}

}
/*Assignment2:
=============
Package   :org.college
Class     :College
Methods   :collegeName(),collegeCode(),collegeRank()

Package   :org.department
Class        :Department
Methods   :deptName()

Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.*/