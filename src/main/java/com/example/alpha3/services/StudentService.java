package com.example.alpha3.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.alpha3.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public Student getStudent(int id);

	public Student createStudent(Student student);

	public Student updateStudent(Student student);

	public ResponseEntity<?> deleteStudent(int id);

}
