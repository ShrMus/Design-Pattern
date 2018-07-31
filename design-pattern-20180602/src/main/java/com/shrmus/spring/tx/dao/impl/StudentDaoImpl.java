package com.shrmus.spring.tx.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.shrmus.spring.tx.dao.StudentDao;
import com.shrmus.spring.tx.pojo.Student;

/**
 * 
 * <p>Title:StudentDao</p>
 * <p>Description:</p>
 * @author Shr
 * @date 2018年7月31日下午7:12:54
 * @version
 */
public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 查找所有学生
	 * @return
	 */
	public List<Student> getStudentList(){
		String sql = "select stu_id,stu_name,stu_age,stu_gender from jdbc01_student";
		
		List<Student> studentList = jdbcTemplate.query(sql, new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id = Integer.parseInt(rs.getString(1));
				String name = rs.getString(2);
				Integer age = Integer.parseInt(rs.getString(3));
				Integer gender = Integer.parseInt(rs.getString(4));
				return new Student(id,name,age,gender);
			}
		});
		return studentList;
	}
	
	/**
	 * 添加一条记录
	 * @param student
	 * @return
	 */
	public void addStudent(Student student) {
		String sql = "insert into jdbc01_student(stu_name,stu_age,stu_gender) "
				+ "values(?,?,?)";
		jdbcTemplate.update(sql, student.getName(),+student.getAge(),student.getGender());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
