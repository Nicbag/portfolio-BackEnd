package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOPersona;
import com.protfoliowebspring.portfolioSpring.model.persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class personaService  implements ipersonaService {
    @Autowired
    public personaRepository persoRepository;

    @Override
    public List<DTOPersona> verPersona() {
        List<DTOPersona> persona= new ArrayList<>();
        DTOPersona dto= new DTOPersona();
        List<persona> per= persoRepository.findAll();
        for(persona p: per ) {
            dto.setNombrePersona(p.getNombrePersona());
            dto.setApellidoPersona(p.getApellidoPersona());
            dto.setAcercadePersona(p.getAcercadePersona());
            dto.setCelularPersona(p.getCelularPersona());
            dto.setEmailPersona(p.getEmailPersona());
            dto.setFotoPersona(p.getFotoPersona());
            dto.setRubroPersona(p.getRubroPersona());
            dto.setLinkdlnPersona(p.getLinkedlnPersona());
            dto.setActualidadPersona(p.getActualidadPersona());
            dto.setCiudadPersona(p.getCiudadPersona());
            persona.add(dto);
        }
        return persona;

    }

    @Override
    public void modificarPersona(DTOPersona per) {
        List<persona> person = persoRepository.findAll();
        for(persona pers: person){
            pers.setNombrePersona(per.getNombrePersona());
            pers.setApellidoPersona(per.getApellidoPersona());
            pers.setAcercadePersona(per.getAcercadePersona());
            pers.setCiudadPersona(per.getCiudadPersona());
            pers.setCelularPersona(per.getCelularPersona());
            pers.setEmailPersona(per.getEmailPersona());
            pers.setFotoPersona(per.getFotoPersona());
            pers.setRubroPersona(per.getRubroPersona());
            pers.setActualidadPersona(per.getActualidadPersona());
            pers.setLinkedlnPersona(pers.getLinkedlnPersona());

        }
        persoRepository.saveAll(person);
    }
}
