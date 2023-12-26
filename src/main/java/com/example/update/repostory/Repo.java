package com.example.update.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.update.data.Student;

@Repository
public interface Repo extends JpaRepository<Student, Integer>{

}
