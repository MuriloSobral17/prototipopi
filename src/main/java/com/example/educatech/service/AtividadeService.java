package com.example.educatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educatech.model.Atividade;
import com.example.educatech.repository.AtividadeRepository;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    public List<Atividade> listarTodas() {
        return atividadeRepository.findAll();
    }

    public Optional<Atividade> buscarPorId(String id) {
        return atividadeRepository.findById(id);
    }

    
    public Atividade salvar(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public void deletar(String id) {
        atividadeRepository.deleteById(id);
    }

    public Atividade atualizar(String id, Atividade atividadeAtualizada) {
        return atividadeRepository.findById(id)
            .map(atividadeExistente -> {
                atividadeExistente.setTitulo(atividadeAtualizada.getTitulo());
                atividadeExistente.setEnunciado(atividadeAtualizada.getEnunciado());
                atividadeExistente.setDificuldade(atividadeAtualizada.getDificuldade());
                atividadeExistente.setExemploEntrada(atividadeAtualizada.getExemploEntrada());
                atividadeExistente.setExemploSaida(atividadeAtualizada.getExemploSaida());
                return atividadeRepository.save(atividadeExistente);
            }).orElseThrow(() -> new RuntimeException("Atividade não encontrada com o id: " + id));
    }
}
