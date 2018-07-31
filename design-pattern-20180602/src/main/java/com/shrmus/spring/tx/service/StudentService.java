package com.shrmus.spring.tx.service;

import java.util.List;

import com.shrmus.spring.tx.pojo.Student;

public interface StudentService {
	public void addStudent(Student student);
	public List<Student> getStudentList();
	public void updateStudent();
}
