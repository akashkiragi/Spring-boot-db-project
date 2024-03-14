package com.kiragi.practice.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatamapSevices {
	
	@Autowired
	StudentRepo repo;
	
	public List<Student> getStudentDataMap() {
		List<Student> students = new ArrayList<Student>();
		repo.findAll().forEach(students::add);
		return students;
	}
	
	public Student getDataMapWithid(String id) {
		return repo.findById(id).get();
	}


	public List<Student> getStudentDataMap(Student student, String id) {
		repo.save(student);
		return  getStudentDataMap();
	}
	
	public List<Student> deleteDataMapWithid(String id) {
		repo.deleteById(id);
		return  getStudentDataMap();
	}


	public List<Student> addStudentDataMap(Student student) {
		repo.save(student);
		return   getStudentDataMap();
	}
	
	public List<Student> addMultipleStudentDataMap(List<Student> student) {
		repo.saveAll(student);
		return   getStudentDataMap();
	}
	
}
