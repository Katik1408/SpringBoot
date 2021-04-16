package com.example.alpha3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	@Column(name = "studentname")
	private String StudentName;
	private String Place;
	private int Age;

	public Student(int id, String studentName, String place, int age) {
		super();
		this.id = id;
		StudentName = studentName;
		Place = place;
		Age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public int getAge() {
		return Age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", Place=" + Place + ", Age=" + Age + "]";
	}

	public void setAge(int age) {
		Age = age;
	}

}
