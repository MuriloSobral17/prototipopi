package com.example.educatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educatech.model.Professor;
import com.example.educatech.repository.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }

    public Optional<Professor> buscarPorId(String id) {
       return professorRepository.findById(id);
    }

    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }

    public Optional<Professor> atualizar(String id, Professor professor) {
        return professorRepository.findById(id).map(existing -> {
            existing.setNome(professor.getNome());
            existing.setEmail(professor.getEmail());
            existing.setCpf(professor.getCpf());
            existing.setSenha(professor.getSenha());
            return professorRepository.save(existing);
        });
    }

    public void deletar(String id) {
        professorRepository.deleteById(id);
    }
}
