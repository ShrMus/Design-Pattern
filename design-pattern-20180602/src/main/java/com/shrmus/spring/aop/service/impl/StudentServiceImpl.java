package com.shrmus.spring.aop.service.impl;

import com.shrmus.spring.aop.service.StudentService;
import com.shrmus.spring.ioc.dao.StudentDao;

/**
 * Target object 目标对象
 * <p>Title:StudentServiceImpl</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年7月31日上午1:09:48
 * @version
 */
public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	/**
	 * Joint point 连接点
	 * 添加一个学生的信息
	 */
	public void addStudent() {
		System.out.println("addStudent()");
	}
	
	/**
	 * Joint point 连接点
	 * 查找所有学生信息
	 */
	public void getStudentList() {
		System.out.println("getStudentList()");
//		int i = 1/0;
	}
	
	/**
	 * Joint point 连接点
	 * 修改学生信息
	 */
	public void updateStudent() {
		System.out.println("updateStudent()");
	}

}
