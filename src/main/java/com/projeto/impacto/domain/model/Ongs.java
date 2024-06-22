package com.projeto.impacto.domain.model;

import java.time.ZonedDateTime;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.*;

// Tabela ONGs
@Entity
@Table (name = "ongs")
public class Ongs implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ongs", nullable = false, unique = true)
    private int idOngs;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true, length = 20)
    private String cnpj;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, length = 18)
    private String telefone;

    @Column(length = 18)
    private String telefoneReserva;

    @Column(nullable = false)
    private String causas;

    @Column(name = "foto_perfil")
    private String fotoPerfil;

    @Column(nullable = false)
    private String localAtuacao;

    @Column(columnDefinition = "TEXT")
    private String sobreOng;

    @Column(name = "cadastrado_em", nullable = false)
    private ZonedDateTime cadastradoEm = ZonedDateTime.now();

    @Column(name = "atualizado_em", nullable = false)
    private ZonedDateTime atualizadoEm = ZonedDateTime.now();

    @Column(name = "status_conta", nullable = false)
    private StatusConta statusConta = StatusConta.ativo;

    
    //Enum
    public enum StatusConta{
        ativo, inativo, bloqueado
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Procurar maneiras de criptografar a senha

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

    public String getCausas() {
        return causas;
    }
    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }
    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getLocalAtuacao() {
        return localAtuacao;
    }
    public void setLocalAtuacao(String localAtuacao) {
        this.localAtuacao = localAtuacao;
    }

    public String getSobreOng() {
        return sobreOng;
    }
    public void setSobreOng(String sobreOng) {
        this.sobreOng = sobreOng;
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

    public StatusConta getStatusConta() {
        return statusConta;
    }
    public void setStatusConta(StatusConta statusConta) {
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