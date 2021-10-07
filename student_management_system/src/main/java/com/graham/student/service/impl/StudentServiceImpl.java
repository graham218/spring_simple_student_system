package com.graham.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graham.student.entity.Student;
import com.graham.student.repository.StudentRepository;
import com.graham.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
