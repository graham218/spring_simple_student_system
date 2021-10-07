package com.graham.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graham.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
