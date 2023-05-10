package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTOIdioma;
import com.protfoliowebspring.portfolioSpring.service.idiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "*")

public class idiomaController {

    @Autowired
    public idiomaService idiService;

    @GetMapping("/ver/idiomas")
    @ResponseBody
    public List<DTOIdioma> verIdiomas(){
        return idiService.verIdiomas();
    }

    @PutMapping("/modificar/idioma")
    public void modificarIdioma(@RequestBody DTOIdioma dto){
        idiService.modificarIdioma(dto);
    }

    //probado y funcando

    @PostMapping("/agregar/idioma")
    public void agregarIdioma(@RequestBody DTOIdioma dto){
        idiService.agregarIdioma(dto);
    }

    @DeleteMapping("/eliminar/idioma/{id}")
    public void eliminarIdioma(@PathVariable Long id){
        idiService.eliminarIdioma(id);
    }

    //COMPLETADO Y PROBADO
}
