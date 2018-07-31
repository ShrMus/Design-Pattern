package com.shrmus.spring.tx.service.impl;

import java.util.List;

import com.shrmus.spring.tx.service.StudentService;
import com.shrmus.spring.tx.dao.StudentDao;
import com.shrmus.spring.tx.pojo.Student;

/**
 * 事务
 * <p>Title:StudentServiceImpl</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年7月31日下午7:13:13
 * @version
 */
public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	/**
	 * 添加一个学生的信息
	 */
	public void addStudent(Student student) {
		studentDao.addStudent(student);
		// int i = 1/0;
	}
	
	/**
	 * 查找所有学生信息
	 */
	public List<Student> getStudentList() {
		List<Student> studentList = studentDao.getStudentList();
		return studentList;
	}
	
	/**
	 * 修改学生信息
	 */
	public void updateStudent() {
		// TODO 待实现
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
