package com.projeto.impacto.dto.ongs;

// Informações para cadastro
public class OngsRequestDTO {
    private String nome;
    private String cnpj;
    private String email;
    private String fotoPerfil;
    private String sobreOng;
    private String telefone;
    private String localAtuacao;


    //Getters e Setters
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
    public String getFotoPerfil() {
        return fotoPerfil;
    }
    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    public String getSobreOng() {
        return sobreOng;
    }
    public void setSobreOng(String sobreOng) {
        this.sobreOng = sobreOng;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getLocalAtuacao() {
        return localAtuacao;
    }
    public void setLocalAtuacao(String localAtuacao) {
        this.localAtuacao = localAtuacao;
    }    
}
