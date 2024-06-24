package com.projeto.impacto.domain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.impacto.domain.exception.ResourceBadRequestException;
import com.projeto.impacto.domain.exception.ResourceNotFoundException;
import com.projeto.impacto.domain.model.Usuarios;
import com.projeto.impacto.domain.repository.UsuariosRepository;
import com.projeto.impacto.dto.usuarios.UsuariosRequestDTO;
import com.projeto.impacto.dto.usuarios.UsuariosResponseDTO;

@Service
public class UsuariosService implements ICRUDService<UsuariosRequestDTO, UsuariosResponseDTO> {

    @Autowired
    private UsuariosRepository usuariosRepository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<UsuariosResponseDTO> obterTodos() {
        List<Usuarios> usuario = usuariosRepository.findAll();
        List<UsuariosResponseDTO> usuarioDTO = new ArrayList<>();

        for (Usuarios usuarioItem : usuario) {
            UsuariosResponseDTO dto = mapper.map(usuarioItem, UsuariosResponseDTO.class);
            usuarioDTO.add(dto);
        }
        return usuarioDTO;
    }

    @Override
    public UsuariosResponseDTO obterPorId(int id) {
        Optional<Usuarios> optUsuarios = usuariosRepository.findById(id);
        
        if (optUsuarios.isEmpty()){
            throw new ResourceNotFoundException("Puts, user not found");
        }
        return mapper.map(optUsuarios.get(), UsuariosResponseDTO.class);
    }

    @Override
    public UsuariosResponseDTO cadastrar(UsuariosRequestDTO dto) {

        verificacao(dto);
        Usuarios usuario = mapper.map(dto, Usuarios.class);
        // Criptografar senha
        usuario.setId(null);
        usuario.setDataCadastro(new Date());
        usuario = usuariosRepository.save(usuario);
        return mapper.map(usuario, UsuariosResponseDTO.class);
    }

    @Override
    public UsuariosResponseDTO atualizar(int id, UsuariosRequestDTO dto) {
        obterTodos();
        verificacao(dto);

        Usuarios usuario = mapper.map(dto, Usuarios.class);
        // Criptografar senha

        Usuarios.setId(id);
        usuario = usuariosRepository.save(usuario);
        return mapper.map(usuario, UsuariosResponseDTO.class);
    }

    @Override
    public void deletar(int id) {
        obterTodos();
        usuariosRepository.deleteById(id);
    }

    public void verificacao(UsuariosRequestDTO dto){
        if (dto.getEmail() == null || dto.getSenha() == null) {
            throw new ResourceBadRequestException("Os Campos são Obrigatórios");
        }
    }
}
