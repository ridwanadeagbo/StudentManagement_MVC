package com.webapp.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.studentmanagement.model.StudentModel;
import com.webapp.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentrepo;
	
	public List<StudentModel> getAllStudent(){
		return studentrepo.findAll();
	}
	
	public void addStudent(StudentModel student) {
		studentrepo.save(student);
	}

	public void removeStudent(int id) {
		studentrepo.deleteById(id);
	}

	public StudentModel getStudent(int id) {
		return studentrepo.findById(id).get();
	}

	public void updateStudent(StudentModel student) {
		studentrepo.save(student);
		
	}



}
