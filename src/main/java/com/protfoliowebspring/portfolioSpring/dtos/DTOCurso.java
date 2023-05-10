package com.protfoliowebspring.portfolioSpring.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter @Setter @NoArgsConstructor
public class DTOCurso {
    private Long idcurso;
    private String nombreCurso;
    private String institucionCurso;
    private Date fechainicioCurso;
    private Date fechafinCurso;
}
