package com.shrmus.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Advice 通知
 * <p>Title:TxAdvice</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年7月31日上午1:31:32
 * @version
 */
public class MyAdvice implements MethodInterceptor{
	/**
	 * 在被拦截到的方法前后做相应的操作，也就是前置通知，后置通知等
	 * @param invocation 在方法调用的时候截取程序
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("调用方法前....");
		System.out.println("调用方法：" + invocation.getMethod().getName());
		// 获取正在调用的方法
		Object proceed = invocation.proceed();
		System.out.println("调用方法后...");
		return proceed;
	}
	
	public void before() {
		System.out.println("前置通知...");
	}
	
	public void around() {
		System.out.println("环绕通知...");
	}

	public void after() {
		System.out.println("最终通知...");
	}

	public void afterReturning() {
		System.out.println("后置通知...");
	}
	
	public void afterThrowing() {
		System.out.println("异常通知...");
	}
	
}
