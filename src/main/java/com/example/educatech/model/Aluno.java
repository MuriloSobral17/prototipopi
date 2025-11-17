package com.example.educatech.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="alunos")
public class Aluno {

    @Id
    private String idAluno;
    private String nome;
    private String nickname;
    private String email;
    private String senha;

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idaluno) {
        this.idAluno = idaluno;
    }

    
}

