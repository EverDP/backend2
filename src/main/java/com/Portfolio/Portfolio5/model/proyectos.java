
package com.Portfolio.Portfolio5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    
    private String titulo;
    private String Descripcion;    
    private String UrlImagen;
    private String UrlWeb;

    public proyectos() {
    }

    public proyectos(long Id, String titulo, String Descripcion, String UrlImagen, String UrlWeb) {
        this.Id = Id;
        this.titulo = titulo;
        this.Descripcion = Descripcion;
        this.UrlImagen = UrlImagen;
        this.UrlWeb = UrlWeb;
    }



    
    
}
