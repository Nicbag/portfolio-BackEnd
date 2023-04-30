package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOEducacion;
import com.protfoliowebspring.portfolioSpring.model.educacion;

import java.util.List;

public interface ieducacionService {
    public List<DTOEducacion> verEducaciones();
    public void agregarEducacion(DTOEducacion dto);
    public void modificarEducacion(DTOEducacion dto);
    public void eliminarEducacion(Long id);
}
