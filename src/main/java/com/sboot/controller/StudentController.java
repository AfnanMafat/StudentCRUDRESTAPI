package com.sboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.entity.Student;
import com.sboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	// Get
	@GetMapping("/AllStudent")
	public List<Student> AllStudent() {
		return service.ListAll();
	}

	@GetMapping("/Find/{id}")
	public Optional<Student> AllStudent(@PathVariable int id) {
		return service.Find(id);
	}

	// Post
	@PostMapping("/AddStudent")
	public Student AddStudent(@RequestBody Student student) {
		return service.AddStudent(student);
	}

	// Put
	@PutMapping("/UpdateStudent/{id}")
	public void UpdateStudent(@RequestBody Student student, @PathVariable int id) {

		Optional<Student> FindStudent = service.Find(student.getId());

		if (FindStudent == null) {
			System.out.println("Not Found");
		}

		Student UpdateSt = new Student();
		UpdateSt.setId(id);
		UpdateSt.setName(student.getName());
		UpdateSt.setCGPA(student.getCGPA());

		service.UpdateStudent(UpdateSt);
	}

	// Delete
	@DeleteMapping("DeleteStudent/{id}")
	public String DeleteStudent(@PathVariable int id) {

		Optional<Student> FindStudent = service.Find(id);

		if (FindStudent == null) {
			System.out.println("Not Found");
		}
		
		service.DeleteStudent(id);
		
		return "Student Deleted";
	}
}
