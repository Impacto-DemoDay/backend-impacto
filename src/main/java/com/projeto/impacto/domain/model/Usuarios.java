package com.projeto.impacto.domain.model;

import java.sql.Date;
import java.time.ZonedDateTime;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.*;

//Tabela usuarios
@Entity
@Table(name = "usuarios")
public class Usuarios implements UserDetails{ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios", nullable = false, unique = true)
    private int idUsuarios;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true, length = 16)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, length = 20)
    private String telefone;

    @Column(name = "telefone_reserva", length = 20)
    private String telefoneReserva;

    @Column(name = "cadastrado_em", nullable = false)
    private ZonedDateTime cadastradoEm = ZonedDateTime.now();

    @Column(name = "atualizado_em", nullable = false)
    private ZonedDateTime atualizadoEm = ZonedDateTime.now();

    @Column(nullable = false)
    private int pontos = 0;

    @Column(nullable = false)
    private Genero genero;

    private Interesses interesses;

    @Column(name = "status_conta", nullable = false)
    private StatusConta statusConta = StatusConta.ativo;


    // Enum
    public enum Genero{
        masculino, feminino, outros
    }
    public enum Interesses{
        doador, voluntario, ambos
    }
    public enum StatusConta{
        ativo, inativo, bloqueado
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // Get e Set de CPF (procurar maneiras de criptografar isso)

    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // Get e Set de senha (procurar maneiras de criptografar isso)

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefoneReservar(){
        return telefoneReserva;
    }
    public void setTelefoneReserva(String telefoneReserva){
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
    public void setAtualizadoEm(ZonedDateTime novoAtualizadoEm) {
        this.atualizadoEm = novoAtualizadoEm;
    }

    public int getPontos(){
        return pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public Genero getGenero(){
        return genero;
    }
    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public Interesses getInteresses(){
        return interesses;
    }
    public void setInteresses(Interesses interesses){
        this.interesses = interesses;
    }

    public StatusConta getStatusConta(){
        return statusConta;
    }
    public void setstatusConta(StatusConta statusConta){
        this.statusConta = statusConta;
    }


    // Autorização e autenticação
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    @Override
    public String getPassword() {
        return senha;
    }
    @Override
    public String getUsername() {
        return nome;
    }
    @Override
    public boolean isAccountNonExpired () {
        return true;
    }
    @Override
    public boolean isAccountNonLocked () {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired () {
        return true;
    }
    @Override
    public boolean isEnabled () {
        return true;
    }
}