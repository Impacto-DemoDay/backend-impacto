package com.projeto.impacto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.impacto.domain.model.FeedbackTrabalho;

@Repository
public interface FeedbackTrabalhoRepository extends JpaRepository<FeedbackTrabalho, Integer> {
    
}
