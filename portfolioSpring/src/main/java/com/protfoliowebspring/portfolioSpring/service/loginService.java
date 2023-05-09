package com.protfoliowebspring.portfolioSpring.service;

import com.protfoliowebspring.portfolioSpring.dtos.DTOlogin;
import com.protfoliowebspring.portfolioSpring.dtos.DTOloginOut;
import com.protfoliowebspring.portfolioSpring.model.persona;
import com.protfoliowebspring.portfolioSpring.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class loginService implements  iloginService{
    @Autowired
    public personaRepository perRepository;
    @Override
    public DTOloginOut autentificarUsuario(DTOlogin log) {
        Optional<persona> p = perRepository.findById(1l);
        DTOloginOut out= new DTOloginOut();
        String usuario="";
        String password="";
        if(p.isPresent()) {
            persona per= p.get();
            usuario = per.getUsuarioPersona();
            password = per.getPasswordPersona();
        }
        if (log.getNombreUsuario().equals(usuario) && log.getPasswordUsuario().equals(password) ) {
            out.setToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c3VhcmlvUGVyc29uYSI6Im5pY2JhZyIsInBhc3N3b3JkUGVyc29uYSI6ImNhbXBlb25lc2RlbG11bmRvMjAyMiIsImlhdCI6MTUxNjIzOTAyMn0.HCwxvS1OZf89L8nUbaFxLA7VIo6oag8ADc6exUwmAcY");

        }
        return out;
    }
}
