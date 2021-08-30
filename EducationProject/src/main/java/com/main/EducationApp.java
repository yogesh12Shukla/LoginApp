package com.main;

import com.model.Department;
import com.model.Student;
import com.service.DepartmentService;
import com.service.DepartmentServiceImpl;

public class EducationApp {

	public static void main(String[] args) {
		Student student1 =new Student(123,"hello",23);
		Student student2 =new Student(456,"world",24);
		Student student3 =new Student(789,"good",23);

		Department department=new Department();
		department.setDeptId(420);
		department.setDeptName("Computer Science");

		Student[] students=new Student[3];
		students[0]=student1;
		students[1]=student2;
		students[2]=student3;

		department.setStudent(students);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}
		DepartmentService departmentService=new DepartmentServiceImpl();
		Student student =departmentService.searchStudent(department,456);	
		if(student!=null) {
			System.out.println("Student number :" +  student.getStudId());
			System.out.println("Student name   :" + student.getStudName());
			System.out.println("Student age    :" + student.getAge());
		}
		else {
			System.out.println("nothing");
		}
	}

}
