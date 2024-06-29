package com.projeto.impacto.domain.model;

import java.sql.Date;
import java.time.ZonedDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios", nullable = false, unique = true)
    private int idUsuarios;

    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    private String email;

    private String senha;

    @Column(length = 20)
    private String telefone;

    @Column(name = "telefone_reserva", length = 20)
    private String telefoneReserva;

    @Column(name = "cadastrado_em")
    private ZonedDateTime cadastradoEm = ZonedDateTime.now();

    @Column(name = "atualizado_em")
    private ZonedDateTime atualizadoEm = ZonedDateTime.now();

    private int pontos = 0;

    private Genero genero;

    private Interesses interesses;

    @Column(name = "status_conta")
    private StatusConta statusConta = StatusConta.ativo;

    ////Relacionamento entre usuarios e doações
    @OneToMany(mappedBy = "usuarios")
    private List<Doacoes> doacoes;

    //Trabalho voluntario muitos para muitos usuarios
    //feedback e user muitos para um

    // Enum
    public enum Genero {
        masculino, feminino, outros
    }
    public enum Interesses {
        doador, voluntario, ambos
    }
    public enum StatusConta {
        ativo, inativo, bloqueado
    }

    //Getters e Setters
    public int getIdUsuarios() {
        return idUsuarios;
    }
    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefoneReserva() {
        return telefoneReserva;
    }
    public void setTelefoneReserva(String telefoneReserva) {
        this.telefoneReserva = telefoneReserva;
    }
    public ZonedDateTime getCadastradoEm() {
        return cadastradoEm;
    }
    public void setCadastradoEm(ZonedDateTime cadastradoEm) {
        this.cadastradoEm = cadastradoEm;
    }
    public ZonedDateTime getAtualizadoEm() {
        return atualizadoEm;
    }
    public void setAtualizadoEm(ZonedDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Interesses getInteresses() {
        return interesses;
    }
    public void setInteresses(Interesses interesses) {
        this.interesses = interesses;
    }
    public StatusConta getStatusConta() {
        return statusConta;
    }
    public void setStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }
    public List<Doacoes> getDoacoes() {
        return doacoes;
    }
    public void setDoacoes(List<Doacoes> doacoes) {
        this.doacoes = doacoes;
    }
}