package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOExperiencia;
import com.protfoliowebspring.portfolioSpring.model.experiencia;

import java.util.List;

public interface iexperienciaService {

    public List<DTOExperiencia> verExperiencia();
    public void modificarExperiencia(DTOExperiencia dto);
    public void agregarExperiencia(DTOExperiencia dto);
    public void eliminarExperiencia(Long id);
}
