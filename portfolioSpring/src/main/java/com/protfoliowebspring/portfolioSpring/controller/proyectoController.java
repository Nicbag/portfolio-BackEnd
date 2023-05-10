package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTOProyecto;
import com.protfoliowebspring.portfolioSpring.service.proyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "*")

public class proyectoController {

    @Autowired
    public proyectoService proService;

    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<DTOProyecto> verProyectos(){
        return proService.verProyectos();
    }

    @PutMapping("/modificar/proyecto")
    public void modificarProyecto(@RequestBody DTOProyecto dto){
        proService.modificarProyecto(dto);
    }

    @PostMapping("/agregar/proyecto")
    public void agregarProyecto(@RequestBody DTOProyecto dto){
        proService.agregarProyecto(dto);
    }

    @DeleteMapping("/eliminar/proyecto/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        proService.eliminarProyecto(id);
    }

    //COMPLETADO Y PROBADO
}
