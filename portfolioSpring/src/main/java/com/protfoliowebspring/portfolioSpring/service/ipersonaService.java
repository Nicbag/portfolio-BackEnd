package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOPersona;
import com.protfoliowebspring.portfolioSpring.model.persona;

import java.util.List;

public interface ipersonaService {
    public List<DTOPersona> verPersona();
    public void modificarPersona(DTOPersona per);
}

