package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTODestreza;
import com.protfoliowebspring.portfolioSpring.model.destreza;

import java.util.List;

public interface idestrezaService {
    public List<DTODestreza> verDestrezas();
    public void modificarDestreza(DTODestreza dto);
    public void agregarDestreza(DTODestreza dto);
    public void eliminarDestreza(Long id);
}
