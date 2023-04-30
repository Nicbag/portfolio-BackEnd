package com.protfoliowebspring.portfolioSpring.repository;

import com.protfoliowebspring.portfolioSpring.model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository<experiencia, Long> {
}
