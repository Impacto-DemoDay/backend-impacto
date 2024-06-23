package com.projeto.impacto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.impacto.domain.model.Ongs;

@Repository
public interface OngsRepository extends JpaRepository<Ongs, Integer> {
    
}
