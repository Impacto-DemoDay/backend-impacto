package com.projeto.impacto.domain.model;

import java.time.ZonedDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "doacoes")
public class Doacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doacoes", nullable = false, unique = true)
    int id;

    int valor;

    String motivo;

    ZonedDateTime dataDoacao = ZonedDateTime.now();

    @Column(name = "analise_pagamento")
    boolean analisePagamento = false;

    //Relacionamento entre usuarios e doações
    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    private Usuarios usuarios;

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public ZonedDateTime getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(ZonedDateTime dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public boolean isAnalisePagamento() {
        return analisePagamento;
    }

    public void setAnalisePagamento(boolean analisePagamento) {
        this.analisePagamento = analisePagamento;
    }
}
