package com.shrmus.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shrmus.spring.aop.service.StudentService;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		StudentService userService = (StudentService) ac.getBean("studentService");
		
		userService.addStudent();
		System.out.println();

		userService.getStudentList();
		System.out.println();

		userService.updateStudent(); 
	}
}
