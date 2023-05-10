
package com.protfoliowebspring.portfolioSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter @Setter @NoArgsConstructor
@Entity
public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")private Long idcurso;
    @Column(name = "nombreCurso")private String nombreCurso;
    @Column(name = "institucionCurso")private String institucionCurso;
    @Column(name = "fechainicioCurso")private Date fechainicioCurso;
    @Column(name = "fechafinCurso")private Date fechafinCurso;
    @ManyToOne @JoinColumn(name = "id_persona") private persona persona;
    
    //contructor de la clase
    public curso(Long id, String nom, String insti, Date ini, Date fin){
        this.idcurso=id;
        this.nombreCurso=nom;
        this.institucionCurso=insti;
        this.fechainicioCurso=ini;
        this.fechafinCurso =fin;
    }

}
