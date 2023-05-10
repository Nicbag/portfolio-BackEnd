
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
    @Column(name = "especialidadEducacion")private String especialidadEducacion;
    @Column(name = "fotoEducacion")private String fotoEducacion;
    @Column(name = "fechainicioEducacion")private Date fechainicioEducacion;
    @Column(name = "fechafinEducacion")private Date fechafinEducacion;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //contructor de la clase
    public educacion(Long id, String insti, String esp, String foto, Date ini, Date fin){
        this.idEducacion=id;
        this.institucionEducacion=insti;
        this.especialidadEducacion=esp;
        this.fechainicioEducacion=ini;
        this.fechafinEducacion=fin;
    }

}
