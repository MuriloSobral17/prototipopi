package com.example.educatech.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="atividades")
public class Atividade {

    @Id
    private String id;
    private String titulo;
    private String enunciado; 
    private String dificuldade; 
    private String exemploEntrada;
    private String exemploSaida;

    
    public Atividade() {
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getExemploEntrada() {
        return exemploEntrada;
    }

    public void setExemploEntrada(String exemploEntrada) {
        this.exemploEntrada = exemploEntrada;
    }

    public String getExemploSaida() {
        return exemploSaida;
    }

    public void setExemploSaida(String exemploSaida) {
        this.exemploSaida = exemploSaida;
    }
}