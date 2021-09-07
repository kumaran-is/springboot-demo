package com.college.springbootdemo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	

	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
		
	}
	
	@GetMapping("/list")
	public List<Student> getStudents() {
		
		return studentService.getStudents();
		
	}

}
