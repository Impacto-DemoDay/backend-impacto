package com.projeto.impacto.dto.usuarios;

//Informações para cadastro
public class UsuariosRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String telefone;
    private String genero;
    private String interesses;


    //Getters e Setters
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getInteresses() {
        return interesses;
    }
    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }
}
