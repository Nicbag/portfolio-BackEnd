package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.dtos.DTOPersona;
import com.protfoliowebspring.portfolioSpring.model.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.protfoliowebspring.portfolioSpring.service.personaService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class personaController {

    @Autowired
    public personaService perService;

    @GetMapping("/ver/persona")
    @ResponseBody
    public List<DTOPersona> verPersona(){
        return perService.verPersona();
    }

    @PutMapping("/modificar/persona")
    public void modificarPersona(@RequestBody DTOPersona per){
        perService.modificarPersona(per);
    }

    //TODO LISTO Y PROBADO
}
