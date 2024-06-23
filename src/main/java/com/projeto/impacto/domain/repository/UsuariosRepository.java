package com.projeto.impacto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.impacto.domain.model.Usuarios;
import java.util.List;


@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
    List<Usuarios> findByEmail(String email);
    List<Usuarios> findByCpf(String cpf);
    List<Usuarios> findByNome(String nome);
}
