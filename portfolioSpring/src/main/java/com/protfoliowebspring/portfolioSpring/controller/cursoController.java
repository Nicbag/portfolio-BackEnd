package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTOCurso;
import com.protfoliowebspring.portfolioSpring.model.curso;
import com.protfoliowebspring.portfolioSpring.service.cursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "*")

public class cursoController {

    @Autowired
    public cursoService curService;

    @GetMapping("/ver/cursos")
    @ResponseBody
    public List<DTOCurso> verCursos(){
        return curService.verCursos();
    }



    @PutMapping("/modificar/curso")
    public void modificarCurso( @RequestBody  DTOCurso dto){
        curService.modificarCurso(dto);
    }

    //completado hasta y funcionando

    @PostMapping("/agregar/curso")
    public void agregarCurso(@RequestBody DTOCurso dto){
        curService.agregarCurso(dto);
    }

    @DeleteMapping("/eliminar/curso/{id}")
    public void eliminarCurso(@PathVariable Long id){
        curService.eliminarCurso(id);
    }

    //COMPLETADO Y PROBADO
}
