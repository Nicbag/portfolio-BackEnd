package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTOExperiencia;
import com.protfoliowebspring.portfolioSpring.service.experienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "*")

public class experienciaController {
    @Autowired
    public experienciaService expService;

    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<DTOExperiencia> verExperiencias(){
        return expService.verExperiencia();
    }

    @PutMapping("/modificar/experiencia")
    public void modificarExperiencia(@RequestBody DTOExperiencia dto){
        expService.modificarExperiencia(dto);
    }


    @PostMapping("/agregar/experiencia")
    public void agregarExperiencia(@RequestBody DTOExperiencia dto){
        expService.agregarExperiencia(dto);
    }

    @DeleteMapping("/eliminar/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable Long id){
        expService.eliminarExperiencia(id);
    }

    //COMPLETADO Y PROBADO
}
