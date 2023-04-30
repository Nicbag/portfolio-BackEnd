package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iloginService{

    public String autentificarUsuario(String user, String password);
}
