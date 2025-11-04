package com.example.educatech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.educatech.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}