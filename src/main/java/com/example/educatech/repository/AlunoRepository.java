package com.example.educatech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.educatech.model.Aluno;

public interface AlunoRepository extends MongoRepository<Aluno, String> {

}