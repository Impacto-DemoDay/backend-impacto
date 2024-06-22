package com.projeto.impacto.domain.model;

import jakarta.persistence.*;

//Tabela relacionamento Causas Usuarios
@Entity
@Table(name = "causas_usuarios")
public class CausasUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_causas_usuarios", nullable = false, unique = true)
    private int idCausasUsuarios;    

    @ManyToOne
    @JoinColumn(name = "id_usuarios", nullable = false)
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "id_causas", nullable = false)
    private Causas causas;


    //Getters e Setters
    public int getIdCausasUsuarios() {
        return idCausasUsuarios;
    }

    public void setIdCausasUsuarios(int idCausasUsuarios) {
        this.idCausasUsuarios = idCausasUsuarios;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Causas getCausas() {
        return causas;
    }

    public void setCausas(Causas causas) {
        this.causas = causas;
    }
}