
package com.protfoliowebspring.portfolioSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_idioma")private Long idIdioma;
    @Column(name = "nombreIdioma")private String nombreIdioma;
    @Column(name = "nivelIdioma")private String nivelIdioma;
    @Column(name = "valornivelIdioma")private Integer valornivelIdioma;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //contructor de la clase
    public idioma(Long id, String nombre, String niv, Integer val){
        this.idIdioma=id;
        this.nombreIdioma=nombre;
        this.nivelIdioma=niv;
        this.valornivelIdioma=val;
    }


}
