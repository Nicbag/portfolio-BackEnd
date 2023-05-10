package com.protfoliowebspring.portfolioSpring.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class DTOEducacion {
    private Long idEducacion;
    private String institucionEducacion;
    private String especialidadEducacion;
    private String fotoEducacion;
    private Date fechainicioEducacion;
    private Date fechafinEducacion;
}
