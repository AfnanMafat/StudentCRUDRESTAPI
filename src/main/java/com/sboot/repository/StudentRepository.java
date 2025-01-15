package com.sboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
