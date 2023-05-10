package com.protfoliowebspring.portfolioSpring.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class DTOPersona {
    private String nombrePersona;
    private String apellidoPersona;
    private String rubroPersona;
    private String actualidadPersona;
    private String emailPersona;
    private Long celularPersona;
    private String acercadePersona;
    private String ciudadPersona;
    private String fotoPersona;
    private String linkdlnPersona;

    public DTOPersona() {
    }
}
