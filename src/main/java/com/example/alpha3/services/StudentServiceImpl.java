package com.example.alpha3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.alpha3.entity.Student;
import com.example.alpha3.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	List<Student> list;

	@Autowired
	StudentRepository studentRepository;

	public StudentServiceImpl() {

		list = new ArrayList<Student>();

		list.add(new Student(1, "Rahul", "Bangalore", 23));
		list.add(new Student(2, "Rohit", "Pune", 25));
		list.add(new Student(3, "Aditya", "Noida", 27));

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> st = studentRepository.findAll();
		return st;

		// return list;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub

//		Student st = null;
//
//		for (Student s : list) {
//			if (s.getId() == id) {
//				st = s;
//				break;	
//			}
//		}
//		return st;
		return studentRepository.findById(id).get();
	}

	@Override
	public Student createStudent(Student student) {
		// list.add(student);
		return studentRepository.save(student);
		// return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if (e.getId() == student.getId()) {
//				e.setAge(student.getAge());
//				e.setPlace(student.getPlace());
//				e.setStudentName(student.getStudentName());
//			}
//		});
		return studentRepository.save(student);
		// return student;
	}

	@Override
	public ResponseEntity<?> deleteStudent(int id) {
		/*
		 * list.remove(id - 1); return list;
		 */

		studentRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
