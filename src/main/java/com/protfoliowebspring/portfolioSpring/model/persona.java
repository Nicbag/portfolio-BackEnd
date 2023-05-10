
package com.protfoliowebspring.portfolioSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona") private Long idPersona;
    @Column(name = "nombrePersona")private String nombrePersona;
    @Column(name = "apellidoPersona")private String apellidoPersona;
    @Column(name = "rubroPersona")private String rubroPersona;
    @Column(name = "actualidadPersona")private String actualidadPersona;
    @Column(name = "emailPersona")private String emailPersona;
    @Column(name = "celularPersona")private Long celularPersona;
    @Column(name = "acercadePersona")private String acercadePersona;
    @Column(name = "ciudadPersona")private String ciudadPersona;
    @Column(name = "fotoPersona")private String fotoPersona;
    @Column(name = "linkedlnPersona")private String linkedlnPersona;
    @Column(name = "usuarioPersona")private String usuarioPersona;
    @Column(name = "passwordPersona")private String passwordPersona;
    

    
    //Constructor de la clase
    public void Persona(Long id, String n,String ape, String rub, String act, String em, Long cel, String ace, String ciu, String fot, String link, String usu, String pass   ){
        this.idPersona= id;
        this.nombrePersona=n;
        this.apellidoPersona=ape;
        this.rubroPersona=rub;
        this.actualidadPersona=act;
        this.emailPersona=em;
        this.celularPersona=cel;
        this.acercadePersona=ace;
        this.ciudadPersona=ciu;
        this.fotoPersona=fot;
        this.linkedlnPersona=link;
        this.usuarioPersona=usu;
        this.passwordPersona=pass;

    }

}
