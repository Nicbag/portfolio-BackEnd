package com.protfoliowebspring.portfolioSpring.repository;

import com.protfoliowebspring.portfolioSpring.model.proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectoRepository extends JpaRepository<proyecto, Long> {
}
