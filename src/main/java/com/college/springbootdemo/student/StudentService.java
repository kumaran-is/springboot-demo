package com.college.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		
		//return List.of(new Student(10L,"Peter1", "peter@gmail.com", LocalDate.of(2002, 8, 26), 20));
		return studentRepository.findAll();
	}
}
