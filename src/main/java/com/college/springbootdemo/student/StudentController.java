package com.college.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	
	@GetMapping("/list")
	public List<Student> getStudents() {
		
		return List.of(new Student(10L,"Peter", "peter@gmail.com", LocalDate.of(2002, 8, 26), 20));
	}

}
