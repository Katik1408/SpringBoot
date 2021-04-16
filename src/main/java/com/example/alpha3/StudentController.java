package com.example.alpha3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.alpha3.entity.Student;
import com.example.alpha3.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping("/getStudents")
	public String getData() {
		return "All Students";
	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> st = this.service.getAllStudents();

		if (st == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(st, HttpStatus.OK);
		}
	}

	@GetMapping("/students/{id}")
	public Student getStudents(@PathVariable int id) {

		return this.service.getStudent(id);
	}

	@PostMapping(path = "/students", consumes = "application/json")
	public Student createNewStudent(@RequestBody Student student) {
		return this.service.createStudent(student);
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.service.updateStudent(student);
	}

	@DeleteMapping("/students/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable int id) {

		try {
			ResponseEntity<?> r = this.service.deleteStudent(id);
			return new ResponseEntity<>(r, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/deleteMe")
	public ResponseEntity<String> deleteData() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
