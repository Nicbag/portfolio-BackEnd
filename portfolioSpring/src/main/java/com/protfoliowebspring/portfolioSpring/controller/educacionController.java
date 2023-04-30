package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTOEducacion;
import com.protfoliowebspring.portfolioSpring.model.educacion;
import com.protfoliowebspring.portfolioSpring.service.educacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class educacionController {

    @Autowired
    public educacionService eduService;


    @GetMapping("/ver/educaciones")
    @ResponseBody
    public List<DTOEducacion> verEducaciones(){
        return eduService.verEducaciones();
    }

    @PutMapping("/modificar/educacion")
    public void modificarEducacion(@RequestBody DTOEducacion dto){
        eduService.modificarEducacion(dto);
    }
    //completado hasta aca

    @PostMapping("/agregar/educacion")
    public void agregarEducacion(@RequestBody DTOEducacion dto){
        eduService.agregarEducacion(dto);
    }

    @DeleteMapping("/eliminar/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id){
        eduService.eliminarEducacion(id);
    }

    //COMPLETADO Y PROBADO

}
