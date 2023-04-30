package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTODestreza;
import com.protfoliowebspring.portfolioSpring.model.destreza;
import com.protfoliowebspring.portfolioSpring.service.destrezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class destrezaController {

    @Autowired
    public destrezaService desService;

    @GetMapping("/ver/destrezas")
    @ResponseBody
    public List<DTODestreza> verDestrezas(){
        return desService.verDestrezas();
    }

    @PutMapping("/modificar/destreza")
    public void modificarDestreza(@RequestBody DTODestreza dto){
        desService.modificarDestreza(dto);
    }

    //completado hasta aca
    @PostMapping("/agregar/destreza")
    public void agregarDestreza(@RequestBody DTODestreza dto){
        desService.agregarDestreza(dto);
    }
    @DeleteMapping("/eliminar/destreza/{id}")
    public void eliminarDestreza(@PathVariable Long id){
        desService.eliminarDestreza(id);
    }

    //COMPLETADO Y PROBADO
}
