package com.shrmus.annotation.test;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.shrmus.annotation.MySQLDataSource;

/**
 * 测试类
 * <p>Title:AnnotationTest</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年8月8日下午4:48:10
 * @version
 */
public class AnnotationTest {

	/**
	 * 获取数据库连接
	 * @return
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	@MySQLDataSource(
			driverName = "com.mysql.jdbc.Driver", 
			url = "jdbc:mysql://localhost:3306/annotation_20180808", 
			user = "root", 
			password = "shrmus")
	public static Connection getConnection() throws NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException {
		// 获取该类的字节码
		Class clazz = AnnotationTest.class;
		// 获取此方法
		Method method = clazz.getMethod("getConnection",null);
		// 获取此方法上的注解
		MySQLDataSource mySQLDataSource = method.getAnnotation(MySQLDataSource.class);
		// 获取注解的属性值
		String driverName = mySQLDataSource.driverName();
		String url = mySQLDataSource.url();
		String user = mySQLDataSource.user();
		String password = mySQLDataSource.password();
		// 加载数据库驱动
		Class.forName(driverName);
		// 获取数据源
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		Connection connection = getConnection();
		System.out.println(connection);
		connection.close();
	}
}
