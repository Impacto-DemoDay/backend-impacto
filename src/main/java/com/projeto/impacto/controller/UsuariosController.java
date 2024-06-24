package com.projeto.impacto.controller;

//import org.hibernate.mapping.List;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.impacto.domain.service.UsuariosService;
import com.projeto.impacto.dto.usuarios.UsuariosRequestDTO;
import com.projeto.impacto.dto.usuarios.UsuariosResponseDTO;
//import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    private ResponseEntity<List<UsuariosResponseDTO>> obterTodos(){
        return ResponseEntity.ok(usuariosService.obterTodos());
    }

    @GetMapping("/id")
    private ResponseEntity<UsuariosResponseDTO> obterPorId(@PathVariable int id){
        return ResponseEntity.ok(usuariosService.obterPorId(id));
    }

    @PostMapping
    public ResponseEntity<UsuariosResponseDTO> cadastrar(@RequestBody UsuariosRequestDTO dto) {
        UsuariosResponseDTO usuario = usuariosService.cadastrar(dto);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<UsuariosResponseDTO> atualizar(@PathVariable int id, @RequestBody UsuariosRequestDTO dto) {
        UsuariosResponseDTO usuario = usuariosService.atualizar(id, dto);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable int id){
        usuariosService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
