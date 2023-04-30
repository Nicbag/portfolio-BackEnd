package com.protfoliowebspring.portfolioSpring.repository;

import com.protfoliowebspring.portfolioSpring.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository<persona,Long> {

}
