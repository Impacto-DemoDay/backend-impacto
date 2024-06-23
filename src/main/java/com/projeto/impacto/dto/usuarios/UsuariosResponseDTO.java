package com.projeto.impacto.dto.usuarios;

public class UsuariosResponseDTO {
    private String nome;
    private String email;
    private String telefone;
    private String interesses;


    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getInteresses() {
        return interesses;
    }
    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }    
}
