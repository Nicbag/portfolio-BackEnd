package com.protfoliowebspring.portfolioSpring.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter @Setter @NoArgsConstructor
public class DTOProyecto {
    private Long idProyecto;
    private String nombreProyecto;
    private String institucionProyecto;
    private String descripcionProyecto;
    private String linkProyecto;
    private Date fechaProyecto;
}
