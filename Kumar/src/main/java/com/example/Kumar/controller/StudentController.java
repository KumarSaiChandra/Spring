package com.example.Kumar.controller;

import java.time.LocalDate;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kumar.student.Student;

@RestController
public class StudentController {
	
	
	@GetMapping("/api/v1/student")
	public List<Student> getStudents(){
		
		ArrayList<Student> student=new ArrayList<Student>();
		student.add(new Student(1,"Kumar","kumarsai@gmail.com",22,LocalDate.of(2001, 3, 31)));
		return student;
		
	}

}
