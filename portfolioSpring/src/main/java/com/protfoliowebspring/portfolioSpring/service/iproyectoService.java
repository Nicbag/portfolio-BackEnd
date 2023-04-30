package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOProyecto;
import com.protfoliowebspring.portfolioSpring.model.proyecto;

import java.util.List;

public interface iproyectoService {
    public List<DTOProyecto> verProyectos();
    public void modificarProyecto(DTOProyecto dto);
    public void agregarProyecto(DTOProyecto dto);
    public void eliminarProyecto(Long id);
}
