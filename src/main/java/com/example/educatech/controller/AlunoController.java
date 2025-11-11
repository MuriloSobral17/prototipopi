package com.example.educatech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educatech.model.Aluno;
import com.example.educatech.service.AlunoService;


@RestController
@RequestMapping("/usuarios")
public class AlunoController {
    
    @Autowired
    private AlunoService usuarioService;

    @GetMapping
     public List<Aluno> listarTodos(){
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> buscarPorId(@PathVariable String id){
        return usuarioService.buscarPorId(id);
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno usuario){
        return usuarioService.salvar(usuario);       
    } 
}