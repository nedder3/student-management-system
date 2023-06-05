package com.nedder3.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nedder3.sms.entity.Student;
import com.nedder3.sms.repository.StudentRepository;
import com.nedder3.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	

}
