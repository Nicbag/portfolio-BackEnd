package com.protfoliowebspring.portfolioSpring.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DTODestreza {
    private Long idDestreza;
    private String nombreDestreza;
    private Integer nivelDestreza;
}
