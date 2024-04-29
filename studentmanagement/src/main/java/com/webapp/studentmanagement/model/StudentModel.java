package com.webapp.studentmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="student_managemrnt")
public class StudentModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String firstname;
	private String lastname;
	private String tech;
	private String state;
	
	public StudentModel() {
		super();
	}

	
	public StudentModel(String firstname, String lastname, String tech, String state) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.tech = tech;
		this.state = state;
	}

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "StudentService [sid=" + sid + ", firstname=" + firstname + ", lastname=" + lastname + ", tech=" + tech
				+ ", state=" + state + "]";
	}
	
	
}
