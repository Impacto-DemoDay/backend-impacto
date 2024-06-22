package com.projeto.impacto.domain.model;

import jakarta.persistence.*;

//Tabela Endereço usuarios
@Entity
@Table(name = "endereco_usuarios")
public class EnderecoUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco_usuarios", nullable = false, unique = true)
    private int idEnderecoUsuarios;

    @Column(nullable = false, length = 14)
    private String cep;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false, length = 10)
    private String numero;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false, length = 100)
    private String cidade;

    @Column(nullable = false, length = 100)
    private String estado;

    @Column(nullable = false, length = 100)
    private String pais = "Brasil";

    @ManyToOne
    @JoinColumn(name = "id_usuarios", nullable = false)
    private Usuarios usuarios;


    //Getters e Setters
    public int getIdEnderecoUsuarios() {
        return idEnderecoUsuarios;
    }

    public void setIdEnderecoUsuarios(int idEnderecoUsuarios) {
        this.idEnderecoUsuarios = idEnderecoUsuarios;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}