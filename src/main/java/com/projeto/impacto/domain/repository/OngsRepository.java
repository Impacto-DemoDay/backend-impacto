package com.projeto.impacto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.impacto.domain.model.Ongs;
import java.util.List;


@Repository
public interface OngsRepository extends JpaRepository<Ongs, Integer> {
    List<Ongs> findByEmail(String email);
    List<Ongs> findByCnpj(String cnpj);
    List<Ongs> findByNome(String nome);
}
