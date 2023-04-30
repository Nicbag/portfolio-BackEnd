package com.protfoliowebspring.portfolioSpring.repository;

import com.protfoliowebspring.portfolioSpring.model.destreza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface destrezaRepository extends JpaRepository<destreza,Long> {
}
