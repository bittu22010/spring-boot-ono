package com.studentapp.service;

import java.util.List;

import com.studentapp.Student;



public interface IStudentService {
	
void addStudent(Student student);
void updateStudent(Student student);
void deleteStudent(int studentId);

Student getById (int studentId);
List<Student> getAll();
List <Student> getByDepartment(String department);

}
