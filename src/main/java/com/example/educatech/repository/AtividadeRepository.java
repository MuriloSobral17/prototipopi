package com.example.educatech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.educatech.model.Atividade;

public interface AtividadeRepository extends MongoRepository<Atividade, String> {
    
}
