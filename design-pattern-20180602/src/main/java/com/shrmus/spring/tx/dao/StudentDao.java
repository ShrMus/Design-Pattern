package com.shrmus.spring.tx.dao;

import java.util.List;

import com.shrmus.spring.tx.pojo.Student;

public interface StudentDao {
	public List<Student> getStudentList();
	public void addStudent(Student student);
}
