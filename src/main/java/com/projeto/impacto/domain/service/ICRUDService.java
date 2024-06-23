package com.projeto.impacto.domain.service;

import java.util.List;

public interface ICRUDService<Req, Res> {
    List<Res> obterTodos();
    Res obterPorId(int id);
    Res cadastrar (Req dto);
    Res atualizar(int id, Req dto);
    void deletar(int id);
}