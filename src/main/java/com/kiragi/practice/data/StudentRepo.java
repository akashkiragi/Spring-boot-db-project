package com.kiragi.practice.data;


import org.springframework.data.repository.CrudRepository;

interface  StudentRepo extends CrudRepository<Student, String> {
	
}
