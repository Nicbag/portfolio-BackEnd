
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
public class proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")private Long idProyecto;
    @Column(name = "nombreProyecto")private String nombreProyecto;
    @Column(name = "institucionProyecto")private String institucionProyecto;
    @Column(name = "descripcionProyecto")private String descripcionProyecto;
    @Column(name = "linkProyecto")private String linkProyecto;
    @Column(name = "fechaProyecto")private Date fechaProyecto;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //constructor de la clase
    public proyecto(Long id, String nom, String insti, String des, String link, Date fecha ){
        this.idProyecto=id;
        this.nombreProyecto=nom;
        this.institucionProyecto=insti;
        this.linkProyecto=link;
        this.fechaProyecto=fecha;
    }

}
