package com.protfoliowebspring.portfolioSpring.controller;

import com.protfoliowebspring.portfolioSpring.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class loginController {
    @Autowired
    public loginService logService;
    @PostMapping("/login")
    public String autenticacionUsuario(@RequestBody String user,@RequestBody String password){
        return logService.autentificarUsuario(user,password);
    }
}
