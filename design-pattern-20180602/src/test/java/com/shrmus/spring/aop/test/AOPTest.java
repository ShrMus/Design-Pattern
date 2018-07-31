package com.shrmus.spring.aop.test;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

import com.shrmus.spring.aop.advice.MyAdvice;
import com.shrmus.spring.aop.service.StudentService;
import com.shrmus.spring.aop.service.impl.StudentServiceImpl;

/**
 * 测试类
 * <p>Title:AOPTest</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年7月31日上午4:43:08
 * @version
 */
public class AOPTest {
	public static void main(String[] args) {
		// 1、Pointcut 切入点，指定一个规则，拦截哪些方法。
		JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
		pointcut.setPatterns(".*add.*",".*update.*");
		
//		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
//		pointcut.addMethodName("add*");
//		pointcut.addMethodName("update*");
		
//		// 2、Advice 通知，表示对拦截到的方法加上新功能（如日志，事务等）
		MyAdvice advice = new MyAdvice();
//
//		// 3、Pointcut 切入点 + Advice 通知 = Aspect 切面（横切关注点）
		Advisor advisor = new DefaultPointcutAdvisor(pointcut, advice);
		
		// 4、AOP proxy AOP代理
		// 创建目标对象
		StudentService studentService = new StudentServiceImpl();
		ProxyFactory proxyFactory = new ProxyFactory(studentService);
		// 添加通知或切面，可以添加多个
//		proxyFactory.addAdvice(advice);
		proxyFactory.addAdvisor(advisor);
		// 生成代理对象
		StudentService studentServiceProxy = (StudentService) proxyFactory.getProxy(); 

		// 5、使用代理对象
		studentServiceProxy.addStudent();
		System.out.println();

		studentServiceProxy.getStudentList();
		System.out.println();

		studentServiceProxy.updateStudent();
	}
}
