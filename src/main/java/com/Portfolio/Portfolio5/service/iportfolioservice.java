
package com.Portfolio.Portfolio5.service;

import com.Portfolio.Portfolio5.model.proyectos;
import java.util.List;


public interface iportfolioservice  {
    
    
    
/*------------MÉTODOS PARA LA SECCION "PROYECTOS REALIZADOS------------------"*/    
    public void AgregarProyecto(proyectos proy);
    
    public List<proyectos> VerProyectos();
    
    
    
    
}
