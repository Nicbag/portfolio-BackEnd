package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOCurso;
import com.protfoliowebspring.portfolioSpring.model.curso;

import java.util.List;

public interface icursoService {
    public List<DTOCurso> verCursos();
    public void modificarCurso(DTOCurso dto);
    public void agregarCurso(DTOCurso dto);
    public void eliminarCurso(Long id);

}
