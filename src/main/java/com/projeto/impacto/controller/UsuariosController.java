package com.projeto.impacto.controller;

import com.projeto.impacto.domain.model.Usuarios;
import com.projeto.impacto.domain.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public List<Usuarios> getAllUsuarios() {
        return usuariosService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getUsuarioById(@PathVariable int id) {
        Optional<Usuarios> usuario = usuariosService.findById(id);
        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Usuarios createUsuario(@RequestBody Usuarios usuario) {
        return usuariosService.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> updateUsuario(@PathVariable int id, @RequestBody Usuarios usuarioDetails) {
        Optional<Usuarios> usuario = usuariosService.findById(id);
        if (usuario.isPresent()) {
            Usuarios updatedUsuario = usuario.get();
            updatedUsuario.setNome(usuarioDetails.getNome());
            updatedUsuario.setCpf(usuarioDetails.getCpf());
            updatedUsuario.setDataNascimento(usuarioDetails.getDataNascimento());
            updatedUsuario.setEmail(usuarioDetails.getEmail());
            updatedUsuario.setSenha(usuarioDetails.getSenha());
            updatedUsuario.setTelefone(usuarioDetails.getTelefone());
            updatedUsuario.setTelefoneReserva(usuarioDetails.getTelefoneReserva());
            updatedUsuario.setCadastradoEm(usuarioDetails.getCadastradoEm());
            updatedUsuario.setAtualizadoEm(usuarioDetails.getAtualizadoEm());
            updatedUsuario.setPontos(usuarioDetails.getPontos());
            updatedUsuario.setGenero(usuarioDetails.getGenero());
            updatedUsuario.setInteresses(usuarioDetails.getInteresses());
            updatedUsuario.setStatusConta(usuarioDetails.getStatusConta());
            updatedUsuario.setDoacoes(usuarioDetails.getDoacoes());

            return ResponseEntity.ok(usuariosService.save(updatedUsuario));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable int id) {
        Optional<Usuarios> usuario = usuariosService.findById(id);
        if (usuario.isPresent()) {
            usuariosService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
