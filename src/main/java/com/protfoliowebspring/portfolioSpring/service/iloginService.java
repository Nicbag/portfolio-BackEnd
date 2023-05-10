package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOlogin;
import com.protfoliowebspring.portfolioSpring.dtos.DTOloginOut;
import com.protfoliowebspring.portfolioSpring.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iloginService{

    public DTOloginOut autentificarUsuario(DTOlogin dto);
}
