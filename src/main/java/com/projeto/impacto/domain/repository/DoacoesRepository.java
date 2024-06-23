package com.projeto.impacto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoacoesRepository extends JpaRepository <DoacoesRepository, Integer> {
    
}
