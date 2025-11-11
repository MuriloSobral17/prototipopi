package com.example.educatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educatech.model.Aluno;
import com.example.educatech.repository.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository usuarioRepository;

    public List<Aluno> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(String id){
        return usuarioRepository.findById(id);
    }

    public Aluno salvar(Aluno usuario){
        return usuarioRepository.save(usuario);
    }
}
