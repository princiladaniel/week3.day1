package org.student;

import org.college.College;
import org.department.Department;

public class Student extends  Department {
 String name="princy",Dept="ECE";
 int id=12345;
public void studentName () {
	System.out.println(name);
}
 public void studentDept() {
	System.out.println(Dept);
}
 public void studentId() {
	 System.out.println(id);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student detail=new Student();
 detail.collegeCode();
 detail.collegeName();
 detail.collegeRank();
 detail.deptName();
 
 
	}

}
/*Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.*/