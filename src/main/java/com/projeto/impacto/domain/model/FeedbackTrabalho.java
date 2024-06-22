package com.projeto.impacto.domain.model;

import jakarta.persistence.*;

// Tabela FeedBack Trabalhos
@Entity
@Table(name = "feedback_trabalho")
public class FeedbackTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_feedback_trabalho", nullable = false, unique = true)
    private int idFeedbackTrabalho;

    private int satisfacao;

    @Column(columnDefinition = "TEXT")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "id_usuarios", nullable = false)
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "id_trabalhos_voluntarios", nullable = false)
    private TrabalhoVoluntario TrabalhoVoluntario;


    //Getters e Setters
    public int getIdFeedbackTrabalho() {
        return idFeedbackTrabalho;
    }

    public void setIdFeedbackTrabalho(int idFeedbackTrabalho) {
        this.idFeedbackTrabalho = idFeedbackTrabalho;
    }

    public int getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(int satisfacao) {
        this.satisfacao = satisfacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public TrabalhoVoluntario getTrabalhoVoluntario() {
        return TrabalhoVoluntario;
    }

    public void setTrabalhoVoluntario(TrabalhoVoluntario trabalhoVoluntario) {
        TrabalhoVoluntario = trabalhoVoluntario;
    }
}