package com.protfoliowebspring.portfolioSpring.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DTOIdioma {
    private Long idIdioma;
    private String nombreIdioma;
    private String nivelIdioma;
    private Integer valornivelIdioma;
}
