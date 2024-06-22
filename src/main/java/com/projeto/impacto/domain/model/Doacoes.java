package com.projeto.impacto.domain.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "doacoes")
public class Doacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doacoes", unique = true, nullable = false)
    private int idDoacoes;

    @Column(nullable = false)
    private BigDecimal valor;

    private String motivo;

    @Column(name = "data_doacao", nullable = false)
    private ZonedDateTime dataDoacao = ZonedDateTime.now();

    @Column(name = "analise_pagamento", nullable = false)
    private boolean analisePagamento = false;

    @ManyToOne
    @JoinColumn(name = "id_usuarios", nullable = false)
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "id_ongs", nullable = false)
    private Ongs ongs;


    public int getIdDoacoes() {
        return idDoacoes;
    }

    public void setIdDoacoes(int idDoacoes) {
        this.idDoacoes = idDoacoes;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
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

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Ongs getOngs() {
        return ongs;
    }

    public void setOngs(Ongs ongs) {
        this.ongs = ongs;
    }    
}