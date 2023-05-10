package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOIdioma;
import com.protfoliowebspring.portfolioSpring.model.idioma;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.idiomaRepository;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class idiomaService implements iidiomaService {

    @Autowired
    public idiomaRepository idiRepository;
    @Autowired
    public personaRepository perRepository;
    @Override
    public List<DTOIdioma> verIdiomas() {
        List<DTOIdioma> idioma= new ArrayList<>();
        List<idioma> idi= idiRepository.findAll();
        for(idioma i: idi) {
            DTOIdioma dto = new DTOIdioma();
            dto.setIdIdioma(i.getIdIdioma());
            dto.setNivelIdioma(i.getNivelIdioma());
            dto.setValornivelIdioma(i.getValornivelIdioma());
            dto.setNombreIdioma(i.getNombreIdioma());
            idioma.add(dto);
        }
        return idioma;
    }

    @Override
    public void modificarIdioma(DTOIdioma dto) {
        Optional<idioma> optionalIdioma= idiRepository.findById(dto.getIdIdioma());
        if(optionalIdioma.isPresent()){
            idioma idi= optionalIdioma.get();
            idi.setIdIdioma(dto.getIdIdioma());
            idi.setNombreIdioma(dto.getNombreIdioma());
            idi.setNivelIdioma(dto.getNivelIdioma());
            idi.setValornivelIdioma(dto.getValornivelIdioma());
            idiRepository.save(idi);
        }
    }

    @Override
    public void agregarIdioma(DTOIdioma dto) {
        idioma i= new idioma();
        i.setNombreIdioma(dto.getNombreIdioma());
        i.setNivelIdioma(dto.getNivelIdioma());
        i.setValornivelIdioma(dto.getValornivelIdioma());
        List<persona> per= perRepository.findAll();
        for (persona p: per){
            i.setPersona(p);
        }
        idiRepository.save(i);
    }

    @Override
    public void eliminarIdioma(Long id) {
        idiRepository.deleteById(id);
    }
}
