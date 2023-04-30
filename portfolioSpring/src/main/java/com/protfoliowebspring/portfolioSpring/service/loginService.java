package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginService implements  iloginService{
    @Autowired
    public personaRepository perRepository;
    @Override
    public String autentificarUsuario(String user, String password) {
        List<persona> p = perRepository.findAll();
        String usuario="";
        String contraseña="";
        for (persona per : p) {
            usuario = per.getUsuarioPersona();
            contraseña = per.getPasswordPersona();
        }
        if (user == usuario & password == contraseña) {
            String JWT = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c3VhcmlvUGVyc29uYSI6Im5pY2JhZyIsInBhc3N3b3JkUGVyc29uYSI6ImNhbXBlb25lc2RlbG11bmRvMjAyMiIsImlhdCI6MTUxNjIzOTAyMn0.HCwxvS1OZf89L8nUbaFxLA7VIo6oag8ADc6exUwmAcY";
            return JWT;
        }else{
            return "";
        }
    }
}
