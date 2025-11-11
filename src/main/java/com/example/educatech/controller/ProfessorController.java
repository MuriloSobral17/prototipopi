package com.example.educatech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.educatech.model.Professor;
import com.example.educatech.model.Usuario;
import com.example.educatech.service.ProfessorService;

public class ProfessorController {
    @Autowired
    ProfessorService professorService;


    @GetMapping
     public List<Professor> listarTodos(){
        return professorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Professor> buscarPorId(@PathVariable String id){
        return professorService.buscarPorId(id);
    }

    @PostMapping
    public Professor criar(@RequestBody Professor professor){
        return professorService.salvar(professor);       
    } 
}
