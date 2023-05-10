package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOIdioma;
import com.protfoliowebspring.portfolioSpring.model.idioma;

import java.util.List;

public interface iidiomaService {
    public List<DTOIdioma> verIdiomas();
    public void modificarIdioma(DTOIdioma dto);
    public void agregarIdioma(DTOIdioma dto);
    public void eliminarIdioma(Long id);
}
