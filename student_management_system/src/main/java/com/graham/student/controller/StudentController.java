package com.graham.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.graham.student.entity.Student;
import com.graham.student.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentservice.getAllStudents());
		return "students";
	}
	
	//add new students handler method
	@GetMapping("/students/new")
	public String createNewStudent(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
}
