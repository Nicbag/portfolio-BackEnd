package com.protfoliowebspring.portfolioSpring.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter @Setter @NoArgsConstructor
public class DTOExperiencia {
    private Long idExperiencia;
    private String puestoExperiencia;
    private String descripcionExperiencia;
    private String empresaExperiencia;
    private Date fechainicioExperiencia;
    private Date fechafinExperiencia;
}
