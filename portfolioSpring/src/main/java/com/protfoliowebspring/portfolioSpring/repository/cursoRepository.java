package com.protfoliowebspring.portfolioSpring.repository;

import com.protfoliowebspring.portfolioSpring.model.curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cursoRepository extends JpaRepository<curso, Long> {
}
