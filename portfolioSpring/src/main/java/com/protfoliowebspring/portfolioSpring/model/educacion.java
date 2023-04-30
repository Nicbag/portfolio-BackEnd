
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
public class educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_educacion")private Long idEducacion;
    @Column(name = "institucionEducacion")private String institucionEducacion;
    @Column(name = "especialidadEducacion")private String especialidadEduacion;
    @Column(name = "fotoEducacion")private String fotoEduacion;
    @Column(name = "fechainicioEducacion")private Date fechainicioEduacion;
    @Column(name = "fechafinEducacion")private Date fechafinEduacion;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //contructor de la clase
    public educacion(Long id, String insti, String esp, String foto, Date ini, Date fin){
        this.idEducacion=id;
        this.institucionEducacion=insti;
        this.especialidadEduacion=esp;
        this.fechainicioEduacion=ini;
        this.fechafinEduacion=fin;
    }

}
