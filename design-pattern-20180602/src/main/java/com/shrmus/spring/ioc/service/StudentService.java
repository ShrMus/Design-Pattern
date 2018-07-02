package com.shrmus.spring.ioc.service;

import java.util.List;

import com.shrmus.spring.ioc.dao.StudentDao;
import com.shrmus.spring.ioc.pojo.Student;

public class StudentService {
	private StudentDao studentDao;
	
	// 构造方法注入
	public StudentService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	// Setter方法注入
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	/**
	 * 查找所有学生
	 * @return
	 */
	public List<Student> getStudentList(){
		StudentDao studentDao = new StudentDao();
		List<Student> studentList = studentDao.getStudentList();
		return studentList;
	}
	
	/**
	 * 添加一个学生的信息
	 * @param student
	 * @return
	 */
	public int addStudent(Student student) {
		StudentDao studentDao = new StudentDao();
		int accpetRow = studentDao.addStudent(student);
		return accpetRow;
	}

}
