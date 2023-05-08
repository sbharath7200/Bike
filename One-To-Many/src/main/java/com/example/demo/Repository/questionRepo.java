package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.question;

public interface questionRepo extends JpaRepository<question, Integer> {

}