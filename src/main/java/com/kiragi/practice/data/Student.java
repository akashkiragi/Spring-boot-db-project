package com.kiragi.practice.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private String nameOfStudent;
	private String rollNo;
	private String marks;
	private String batch;
	private String department;
	
	
	public Student() {}
	
	
	public Student(String nameOfStudent, String rollNo, String marks, String batch, String department) {
		this.nameOfStudent = nameOfStudent;
		this.rollNo = rollNo;
		this.marks = marks;
		this.batch = batch;
		this.department = department;
	}


	public String getNameOfStudent() {
		return nameOfStudent;
	}
	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
