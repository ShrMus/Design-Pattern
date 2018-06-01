package com.shrmus.demo02;

public class Student {
	private String name;
	private int age;
	private Bag bag;
	
	private Teacher[] teachers;
	
	private Student[] classmates;
	
	private Book[] books;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bag getBag() {
		return bag;
	}
	public void setBag(Bag bag) {
		this.bag = bag;
	}
	public Teacher[] getTeachers() {
		return teachers;
	}
	public void setTeachers(Teacher[] teachers) {
		this.teachers = teachers;
	}
	public Student[] getClassmates() {
		return classmates;
	}
	public void setClassmates(Student[] classmates) {
		this.classmates = classmates;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
}
