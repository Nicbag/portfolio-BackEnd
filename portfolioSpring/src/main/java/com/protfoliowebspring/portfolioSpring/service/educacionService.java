package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOCurso;
import com.protfoliowebspring.portfolioSpring.dtos.DTOEducacion;
import com.protfoliowebspring.portfolioSpring.model.curso;
import com.protfoliowebspring.portfolioSpring.model.educacion;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.protfoliowebspring.portfolioSpring.repository.educacionRepository;

import java.sql.Date;
import java.util.*;

@Service
public class educacionService implements  ieducacionService{
    @Autowired
    public educacionRepository eduRepository;
    @Autowired
    public personaRepository perRespository;
    @Override
    public List<DTOEducacion> verEducaciones() {
        List<DTOEducacion> educacion= new ArrayList<>();
        List<educacion> edu= eduRepository.findAll();
        for(educacion e: edu){
            DTOEducacion dto= new DTOEducacion();
            dto.setIdEducacion(e.getIdEducacion());
            dto.setEspecialidadEduacion(e.getEspecialidadEduacion());
            dto.setFechainicioEducacion(e.getFechainicioEduacion());
            dto.setFechafinEducacion(e.getFechafinEduacion());
            dto.setInstitucionEducacion(e.getInstitucionEducacion());
            dto.setFotoEducacion(e.getFotoEduacion());
            educacion.add(dto);
        }
        return educacion;
    }

    @Override
    public void agregarEducacion(DTOEducacion dto) {
        educacion e= new educacion();
        e.setInstitucionEducacion(dto.getInstitucionEducacion());
        e.setEspecialidadEduacion(dto.getEspecialidadEduacion());
        e.setFechainicioEduacion(dto.getFechainicioEducacion());
        e.setFechafinEduacion(dto.getFechafinEducacion());
        e.setFotoEduacion(dto.getFotoEducacion());
        List<persona> per= perRespository.findAll();
        for (persona p: per){
            e.setPersona(p);
        }
        eduRepository.save(e);

    }

    @Override
    public void modificarEducacion(DTOEducacion dto) {
        Optional<educacion> optionalEducacion= eduRepository.findById(dto.getIdEducacion());
        if(optionalEducacion.isPresent()) {
            Date fechainiact= new Date(dto.getFechainicioEducacion().getTime() +86400000);
            Date fechafinact= new Date(dto.getFechafinEducacion().getTime() +86400000);

            educacion e = optionalEducacion.get();
            e.setIdEducacion(dto.getIdEducacion());
            e.setInstitucionEducacion(dto.getInstitucionEducacion());
            e.setEspecialidadEduacion(dto.getEspecialidadEduacion());
            e.setFechainicioEduacion(fechainiact);
            e.setFechafinEduacion(fechafinact);
            e.setFotoEduacion(dto.getFotoEducacion());
            eduRepository.save(e);
        }
    }

    @Override
    public void eliminarEducacion(Long id) {
        eduRepository.deleteById(id);
    }
}
