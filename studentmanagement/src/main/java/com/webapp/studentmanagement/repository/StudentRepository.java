package com.webapp.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.studentmanagement.model.StudentModel;


@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {



}
