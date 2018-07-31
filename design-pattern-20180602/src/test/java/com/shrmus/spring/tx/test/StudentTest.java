package com.shrmus.spring.tx.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shrmus.spring.tx.pojo.Student;
import com.shrmus.spring.tx.service.StudentService;

public class StudentTest {

	@Test
	public void addStudent() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-tx.xml");
		StudentService userService = (StudentService) ac.getBean("studentService");
		Student student = new Student("haha",22,1);
		userService.addStudent(student);
	}

	@Test
	public void getStudentList() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-tx.xml");
		StudentService userService = (StudentService) ac.getBean("studentService");
		List<Student> studentList = userService.getStudentList();
		System.out.println(studentList);
	}
}
