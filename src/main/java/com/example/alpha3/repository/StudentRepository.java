package com.example.alpha3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alpha3.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
