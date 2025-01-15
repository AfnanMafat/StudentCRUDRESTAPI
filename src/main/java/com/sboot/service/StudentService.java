package com.sboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.entity.Student;
import com.sboot.repository.StudentRepository;

@Service
public class StudentService {
	
	StudentRepository repository;
	
	@Autowired
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	
	public List<Student> ListAll(){
		return repository.findAll();
	}
	
	public Optional<Student> Find(int id){
		return repository.findById(id);
	} 
	
	public Student AddStudent(Student student) {
		return repository.save(student);
	}
 
	public Student UpdateStudent(Student student) {
		return repository.save(student); 
	}

	public void DeleteStudent(int id) {
		
		repository.deleteById(id);
		
	}
}
