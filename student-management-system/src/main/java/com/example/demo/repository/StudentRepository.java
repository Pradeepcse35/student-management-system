package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;

//@Repository // letting k no its Repository rather than default // not needed on service layer
public interface StudentRepository extends JpaRepository<Student,Long> {
    // <entity name , type of primary key> // type of primary key cannot be primitive
}