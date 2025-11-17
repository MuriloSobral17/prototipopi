package com.example.educatech.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@Document(collection = "rankings")
public class Ranking {
    @Id
    private String idRanking;
    private String alunoId; // referência ao idAluno em Aluno
    private String nickname;
    private long pontos;
    private Integer posicao;
    private Integer nivel;
    private Integer atividadesConcluidas;
    private Long tempoTotal; // em segundos
    private Instant ultimaAtualizacao;
    private Map<String, Integer> estatisticasPorDificuldade; // ex: {"facil": 3, "medio":2}
    private List<String> badges;

    public String getIdRanking() {
        return idRanking;
    }

    public void setIdRanking(String idRanking) {
        this.idRanking = idRanking;
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getPontos() {
        return pontos;
    }

    public void setPontos(long pontos) {
        this.pontos = pontos;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getAtividadesConcluidas() {
        return atividadesConcluidas;
    }

    public void setAtividadesConcluidas(Integer atividadesConcluidas) {
        this.atividadesConcluidas = atividadesConcluidas;
    }

    public Long getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(Long tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public Instant getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Instant ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Map<String, Integer> getEstatisticasPorDificuldade() {
        return estatisticasPorDificuldade;
    }

    public void setEstatisticasPorDificuldade(Map<String, Integer> estatisticasPorDificuldade) {
        this.estatisticasPorDificuldade = estatisticasPorDificuldade;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }
}
