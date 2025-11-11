package com.example.educatech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.educatech.model.Professor;

public interface ProfessorRepository extends MongoRepository<Professor, String> {
    
}
