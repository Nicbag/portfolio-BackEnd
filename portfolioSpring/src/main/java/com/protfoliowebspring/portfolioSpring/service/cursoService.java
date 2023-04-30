package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOCurso;
import com.protfoliowebspring.portfolioSpring.model.curso;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.protfoliowebspring.portfolioSpring.repository.cursoRepository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class cursoService implements  icursoService{
    @Autowired
     public cursoRepository curRepository;
    @Autowired
    public personaRepository perRepository;

    @Override
    public List<DTOCurso> verCursos() {
        List<DTOCurso> curso= new ArrayList<>();
        List<curso> cur= curRepository.findAll();
        for(curso c: cur){
            DTOCurso dto= new DTOCurso();
            dto.setNombreCurso(c.getNombreCurso());
            dto.setIdcurso(c.getIdcurso());
            dto.setFechainicioCurso(c.getFechainicioCurso());
            dto.setFechafinCurso(c.getFechafinCurso());
            dto.setInstitucionCurso(c.getInstitucionCurso());
            curso.add(dto);
        }
        return curso;
    }

    @Override
    public void modificarCurso(DTOCurso dto) {
        Optional<curso> optionalCurso= curRepository.findById(dto.getIdcurso());
        if(optionalCurso.isPresent()){
            Date fechainiact= new Date(dto.getFechainicioCurso().getTime() +86400000);
            Date fechafinact= new Date(dto.getFechafinCurso().getTime() +86400000);
            curso c = optionalCurso.get();
            c.setNombreCurso(dto.getNombreCurso());
            c.setIdcurso(dto.getIdcurso());
            c.setInstitucionCurso(dto.getInstitucionCurso());
            c.setFechainicioCurso(fechainiact);
            c.setFechafinCurso(fechafinact);
            curRepository.save(c);
        }
    }

    @Override
    public void agregarCurso(DTOCurso dto) {
        curso c= new curso();
        c.setIdcurso(dto.getIdcurso());
        c.setNombreCurso(dto.getNombreCurso());
        c.setInstitucionCurso(dto.getInstitucionCurso());
        c.setFechainicioCurso(dto.getFechainicioCurso());
        c.setFechafinCurso(dto.getFechafinCurso());
        List<persona> p= perRepository.findAll();
        for(persona per : p){
            c.setPersona(per);
        }
        curRepository.save(c);
    }

    @Override
    public void eliminarCurso(Long id) {
        curRepository.deleteById(id);
    }
}
