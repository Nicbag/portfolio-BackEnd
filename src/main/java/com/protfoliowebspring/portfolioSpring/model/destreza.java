
package com.protfoliowebspring.portfolioSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class destreza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_destreza")private Long idDestreza;
    @Column(name = "nombreDestreza")private String nombreDestreza;
    @Column(name = "nivelDestreza")private Integer nivelDestreza;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //contructor de la clase
    public destreza(Long id, String nom, Integer niv){
        this.idDestreza=id;
        this.nombreDestreza=nom;
        this.nivelDestreza=niv;
    }

}
