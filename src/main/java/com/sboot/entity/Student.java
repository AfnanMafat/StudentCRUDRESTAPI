package com.sboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@jakarta.persistence.Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name = "cgpa")
	private double CGPA;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}

	public Student(int id, String name, double cGPA) {
		super();
		Id = id;
		Name = name;
		CGPA = cGPA;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
