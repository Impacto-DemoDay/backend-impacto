package com.projeto.impacto.domain.service;

import com.projeto.impacto.domain.model.Usuarios;
import com.projeto.impacto.domain.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    public Optional<Usuarios> findById(int id) {
        return usuariosRepository.findById(id);
    }

    public Usuarios save(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    public void deleteById(int id) {
        usuariosRepository.deleteById(id);
    }
}