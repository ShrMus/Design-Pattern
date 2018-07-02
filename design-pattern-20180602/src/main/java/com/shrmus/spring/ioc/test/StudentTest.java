package com.shrmus.spring.ioc.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.shrmus.spring.ioc.dao.StudentDao;
import com.shrmus.spring.ioc.pojo.Student;

public class StudentTest {
	@Test
	public void test01() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
		List<Student> studentList = studentDao.getStudentList();
		System.out.println(studentList);
		// 输出 [Student [id=1, name=张三, age=20, gender=1], Student [id=3, name=33, age=333, gender=3333]]
	}
}
