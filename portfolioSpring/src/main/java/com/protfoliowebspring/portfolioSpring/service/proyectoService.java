package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOCurso;
import com.protfoliowebspring.portfolioSpring.dtos.DTOProyecto;
import com.protfoliowebspring.portfolioSpring.model.curso;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.model.proyecto;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import com.protfoliowebspring.portfolioSpring.repository.proyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class proyectoService implements iproyectoService {

    @Autowired
    public proyectoRepository proRepository;
    @Autowired
    public personaRepository perRepository;
    @Override
    public List<DTOProyecto> verProyectos() {
        List<DTOProyecto> proyecto= new ArrayList<>();
        List<proyecto> pro= proRepository.findAll();
        for(proyecto p: pro) {
            DTOProyecto dto = new DTOProyecto();
            dto.setIdProyecto(p.getIdProyecto());
            dto.setDescripcionProyecto(p.getDescripcionProyecto());
            dto.setFechaProyecto(p.getFechaProyecto());
            dto.setNombreProyecto(p.getNombreProyecto());
            dto.setLinkProyecto(p.getLinkProyecto());
            dto.setInstitucionProyecto(p.getInstitucionProyecto());
            proyecto.add(dto);
        }
        return proyecto;
    }

    @Override
    public void modificarProyecto(DTOProyecto dto) {
        Optional<proyecto> optionalProyecto= proRepository.findById(dto.getIdProyecto());
        if (optionalProyecto.isPresent()){
            proyecto p= optionalProyecto.get();
            p.setNombreProyecto(dto.getNombreProyecto());
            p.setFechaProyecto(dto.getFechaProyecto());
            p.setIdProyecto(dto.getIdProyecto());
            p.setLinkProyecto(dto.getLinkProyecto());
            p.setInstitucionProyecto(dto.getInstitucionProyecto());
            p.setDescripcionProyecto(dto.getDescripcionProyecto());
            proRepository.save(p);
        }
    }

    @Override
    public void agregarProyecto(DTOProyecto dto) {
        Date fechaproact= new Date(dto.getFechaProyecto().getTime() +86400000);

        proyecto p= new proyecto();
        p.setDescripcionProyecto(dto.getDescripcionProyecto());
        p.setNombreProyecto(dto.getNombreProyecto());
        p.setInstitucionProyecto(dto.getInstitucionProyecto());
        p.setFechaProyecto(fechaproact);
        p.setLinkProyecto(dto.getLinkProyecto());
        List<persona> per= perRepository.findAll();
        for (persona pe:per){
            p.setPersona(pe);
        }
        proRepository.save(p);
    }

    @Override
    public void eliminarProyecto(Long id) {
        proRepository.deleteById(id);
    }
}
