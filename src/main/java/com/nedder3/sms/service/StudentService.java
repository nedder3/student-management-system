package com.nedder3.sms.service;

import java.util.List;

import com.nedder3.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
