package com.service;

import com.model.Department;
import com.model.Student;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public Student searchStudent(Department department, int search) {
  System.out.println(search);
		Student dummyStudent=null;

		Student[] studentArray=department.getStudent();
		System.out.println("number of student:"+studentArray.length);
		for(int i=0; i<studentArray.length;i++) {
			System.out.println(studentArray[i]);
			if(studentArray[i].getStudId()==search)
			{
                 dummyStudent=studentArray[i];
			}

			else
			{
				//failure
				System.out.println("I am in search in Student");
			}


		}
		return dummyStudent;

	}
}
