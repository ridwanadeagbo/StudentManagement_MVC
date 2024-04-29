package com.webapp.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapp.studentmanagement.model.StudentModel;
import com.webapp.studentmanagement.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/students")
	public String getAllStudent(Model model) {
		
		model.addAttribute("students", studentservice.getAllStudent());
		
		return "home";
	}
	
	@GetMapping("/createStudent")
	public String createStudent(Model model) {
		
		StudentModel student = new StudentModel();
		
		model.addAttribute("mystudent", student);
		
		return "create_student";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") StudentModel student ,Model model) {
		
		studentservice.addStudent(student);
		
		return "redirect:/students";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String removeStudent(@PathVariable int id) {
		
		studentservice.removeStudent(id);
		
		return "redirect:/students";
	}
	
	@GetMapping("/editStudent/{id}")
	public String getStudent(@PathVariable int id,Model model) {
		
		model.addAttribute("mystudent", studentservice.getStudent(id));
		
		return "update";
	}

	@PostMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable int id,@ModelAttribute("student") StudentModel student ,Model model) {
		
		StudentModel exitStudent = studentservice.getStudent(id);
		
		exitStudent.setFirstname(student.getFirstname());
		exitStudent.setLastname(student.getLastname());
		exitStudent.setTech(student.getTech());
		exitStudent.setState(student.getState());
		
		studentservice.updateStudent(exitStudent);
		
		return "redirect:/students";
	}
}
