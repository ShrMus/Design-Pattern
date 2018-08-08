package com.shrmus.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，连接MySQL的数据源
 * <p>Title:MySQLDataSource</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年8月8日下午4:45:45
 * @version
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MySQLDataSource {
	String driverName();
	String url();
	String user();
	String password();
}
