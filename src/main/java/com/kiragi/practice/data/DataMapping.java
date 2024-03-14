package com.kiragi.practice.data;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class DataMapping {
	private static final Logger logger = LoggerFactory.getLogger(DataMapping.class);
	
	@Autowired
	private DatamapSevices datamapSevices;
	
	@GetMapping("/dataMap/StudentData")
	public List<Student> detamapWithId(){
		logger.info("Inside the data mapWithID ");
		return  datamapSevices.getStudentDataMap();
	}
	
	@GetMapping("/dataMap/StudentData/{id}")
	public Student detamapWithId(@PathVariable String id){
		logger.info("Inside the data mapWithID ::::"+  id);
		return  datamapSevices.getDataMapWithid(id);
	}
	
	@PostMapping("/dataMap/StudentData/{id}")
	public List<Student> mapStudentData(@RequestBody Student student,@PathVariable String id){
		
		logger.info("Inside the data mapWithID ::::"+  id +"::::::::"+student.toString() );
		return  datamapSevices.getStudentDataMap(student, id);
	}

	@DeleteMapping("/dataMap/StudentData/Delete/{id}")
	public List<Student> mapStudentData(@PathVariable String id){
		return  datamapSevices.deleteDataMapWithid(id);
	}
	
	@PutMapping("/dataMap/StudentData/add")
	public List<Student> addStudentToDataMap(@RequestBody Student student){
		return  datamapSevices.addStudentDataMap(student);
	}
	
	@PutMapping("/dataMap/StudentData/addMultiple")
	public List<Student> addStudentToDataMap(@RequestBody List<Student> student){
		return  datamapSevices.addMultipleStudentDataMap(student);
	}
}
