package com.projeto.impacto.domain.model;

import jakarta.persistence.*;

//Tabela Causas
@Entity
@Table(name = "causas")
public class Causas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_causas", nullable = false, unique = true)
    private int idCausas;

    @Column(name = "nome_causa", nullable = false, unique = true)
    private String nomeCausa;

    @Column(columnDefinition = "TEXT")
    private String descricao;


    //Gettes e Setters
    public int getIdCausas() {
        return idCausas;
    }

    public void setIdCausas(int idCausas) {
        this.idCausas = idCausas;
    }

    public String getNomeCausa() {
        return nomeCausa;
    }

    public void setNomeCausa(String nomeCausa) {
        this.nomeCausa = nomeCausa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}