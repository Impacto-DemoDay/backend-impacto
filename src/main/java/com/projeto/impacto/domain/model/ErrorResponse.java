package com.projeto.impacto.domain.model;

public class ErrorResponse {
    private String DataHora;
    private String Titulo;
    private int Status;
    private String Descrição;

    //Construtor
    public ErrorResponse(String dataHora, String titulo, int status, String descrição) {
        DataHora = dataHora;
        Titulo = titulo;
        Status = status;
        Descrição = descrição;
    }

    //Getters e Setters
    public String getDataHora() {
        return DataHora;
    }
    public void setDataHora(String dataHora) {
        DataHora = dataHora;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public int getStatus() {
        return Status;
    }
    public void setStatus(int status) {
        Status = status;
    }
    public String getDescrição() {
        return Descrição;
    }
    public void setDescrição(String descrição) {
        Descrição = descrição;
    }
}
