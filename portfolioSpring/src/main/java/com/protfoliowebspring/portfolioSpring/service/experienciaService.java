package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOCurso;
import com.protfoliowebspring.portfolioSpring.dtos.DTOExperiencia;
import com.protfoliowebspring.portfolioSpring.model.curso;
import com.protfoliowebspring.portfolioSpring.model.experiencia;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.experienciaRepository;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class experienciaService implements iexperienciaService {
    @Autowired
    public experienciaRepository expRepository;
    @Autowired
    public personaRepository perRepository;

    @Override
    public List<DTOExperiencia> verExperiencia() {
        List<DTOExperiencia> experiencia= new ArrayList<>();
        List<experiencia> exp= expRepository.findAll();
        for(experiencia e: exp){
            DTOExperiencia dto= new DTOExperiencia();
            dto.setIdExperiencia(e.getIdExperiencia());
            dto.setDescripcionExperiencia(e.getDescripcionExperiencia());
            dto.setEmpresaExperiencia(e.getEmpresaExperiencia());
            dto.setPuestoExperiencia(e.getPuestoExperiencia());
            dto.setFechainicioExperiencia(e.getFechainicioExperiencia());
            dto.setFechafinExperiencia(e.getFechafinExperiencia());
            experiencia.add(dto);
        }
        return experiencia;
    }

    @Override
    public void modificarExperiencia(DTOExperiencia dto) {
        Optional<experiencia> optionalExperiencia= expRepository.findById(dto.getIdExperiencia());
        if(optionalExperiencia.isPresent()) {
            experiencia e = optionalExperiencia.get();
            e.setIdExperiencia(dto.getIdExperiencia());
            e.setPuestoExperiencia(dto.getPuestoExperiencia());
            e.setDescripcionExperiencia(dto.getDescripcionExperiencia());
            e.setFechainicioExperiencia(dto.getFechainicioExperiencia());
            e.setFechafinExperiencia(dto.getFechafinExperiencia());
            e.setEmpresaExperiencia(dto.getEmpresaExperiencia());
            expRepository.save(e);
        }
    }

    @Override
    public void agregarExperiencia(DTOExperiencia dto) {
        Date fechainiact= new Date(dto.getFechainicioExperiencia().getTime() +86400000);
        Date fechafinact= new Date(dto.getFechafinExperiencia().getTime() +86400000);
        experiencia e= new experiencia();
        e.setEmpresaExperiencia(dto.getEmpresaExperiencia());
        e.setDescripcionExperiencia(dto.getDescripcionExperiencia());
        e.setPuestoExperiencia(dto.getPuestoExperiencia());
        e.setFechainicioExperiencia(fechainiact);
        e.setFechafinExperiencia(fechafinact);
        List<persona> per= perRepository.findAll();
        for (persona p:per){
            e.setPersona(p);
        }
        expRepository.save(e);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expRepository.deleteById(id);
    }
}
