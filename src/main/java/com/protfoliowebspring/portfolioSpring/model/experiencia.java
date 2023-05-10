
package com.protfoliowebspring.portfolioSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_experiencia")private Long idExperiencia;
    @Column(name = "puestoExperiencia")private String puestoExperiencia;
    @Column(name = "descripcionExperiencia")private String descripcionExperiencia;
    @Column(name = "empresaExperiencia")private String empresaExperiencia;
    @Column(name = "fechainicioExperiencia")private Date fechainicioExperiencia;
    @Column(name = "fechafinExperiencia")private Date fechafinExperiencia;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //constructor de la clase
    public experiencia(Long id, String p, String d, String e, Date ini, Date fin){
        this.idExperiencia=id;
        this.puestoExperiencia=p;
        this.descripcionExperiencia=d;
        this.empresaExperiencia=e;
        this.fechainicioExperiencia=ini;
        this.fechafinExperiencia=fin;
    }

}
