package com.projeto.impacto.domain.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import jakarta.persistence.*;

//Tabela Trabalhos voluntarios
@Entity
@Table(name = "trabalhos_voluntarios")
public class TrabalhoVoluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabalhos_voluntarios", nullable = false, unique = true)
    private int idTrabalhosVoluntarios;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String especializacao;

    @Column(nullable = false)
    private String localizacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    @Column(name = "data_trabalho", nullable = false, updatable = false)
    private LocalDateTime dataTrabalho = LocalDateTime.now();
    @Column(name = "duracao_trabalho", nullable = false)
    private LocalTime duracaoTrabalho;
    
    @ManyToOne
    @JoinColumn(name = "id_usuarios", nullable = false)
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "id_ongs", nullable = false)
    private Ongs ongs;

    @ManyToOne
    @JoinColumn(name = "id_causas", nullable = false)
    private Causas causas;

    
    // Enum
    public enum Genero {
        feminino, masculino, outros
    }


    //Getters e Setters
    public int getIdTrabalhosVoluntarios() {
        return idTrabalhosVoluntarios;
    }
    public void setIdTrabalhosVoluntarios(int idTrabalhosVoluntarios) {
        this.idTrabalhosVoluntarios = idTrabalhosVoluntarios;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDateTime getDataTrabalho() {
        return dataTrabalho;
    }
    public void setDataTrabalho(LocalDateTime dataTrabalho) {
        this.dataTrabalho = dataTrabalho;
    }

    public LocalTime getDuracaoTrabalho() {
        return duracaoTrabalho;
    }
    public void setDuracaoTrabalho(LocalTime duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
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

    public Causas getCausas() {
        return causas;
    }
    public void setCausas(Causas causas) {
        this.causas = causas;
    }
}