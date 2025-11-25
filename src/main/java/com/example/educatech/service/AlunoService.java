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

    public Aluno atualizar(String id, Aluno alunoAtualizado) {
        return usuarioRepository.findById(id)
            .map(alunoExistente -> {
                alunoExistente.setNome(alunoAtualizado.getNome());
                alunoExistente.setNickname(alunoAtualizado.getNickname());
                alunoExistente.setEmail(alunoAtualizado.getEmail());
                alunoExistente.setSenha(alunoAtualizado.getSenha());
                return usuarioRepository.save(alunoExistente);
            }).orElseThrow(() -> new RuntimeException("Aluno não encontrado com o id: " + id));
    }

    public void deletar(String id) {
        usuarioRepository.deleteById(id);
    }
}
