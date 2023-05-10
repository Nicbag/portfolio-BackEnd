package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTODestreza;
import com.protfoliowebspring.portfolioSpring.model.destreza;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.protfoliowebspring.portfolioSpring.repository.destrezaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class destrezaService implements  idestrezaService{

    @Autowired
    public destrezaRepository desRepository;
    @Autowired
    public personaRepository perRepository;
    @Override
    public List<DTODestreza> verDestrezas() {
        List<DTODestreza> destreza= new ArrayList<>();
        List<destreza> des= desRepository.findAll();
        for(destreza d: des) {
            DTODestreza dto = new DTODestreza();
            dto.setIdDestreza(d.getIdDestreza());
            dto.setNombreDestreza(d.getNombreDestreza());
            dto.setNivelDestreza(d.getNivelDestreza());
            destreza.add(dto);
        }
        return destreza;
    }

    @Override
    public void modificarDestreza(DTODestreza dto) {
        Optional<destreza> optionalDestreza= desRepository.findById(dto.getIdDestreza());
        if(optionalDestreza.isPresent()){
            destreza d = optionalDestreza.get();
            d.setIdDestreza(dto.getIdDestreza());
            d.setNombreDestreza(dto.getNombreDestreza());
            d.setNivelDestreza(dto.getNivelDestreza());
            desRepository.save(d);
        }
    }

    @Override
    public void agregarDestreza(DTODestreza dto) {
        destreza d= new destreza();
        d.setNombreDestreza(dto.getNombreDestreza());
        d.setNivelDestreza(dto.getNivelDestreza());
        List<persona> per= perRepository.findAll();
        for(persona p: per){
            d.setPersona(p);
        }
        desRepository.save(d);
    }
    @Override
    public void eliminarDestreza(Long id) {
        desRepository.deleteById(id);
    }
}
