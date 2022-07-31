
package com.Portfolio.Portfolio5.service;

import com.Portfolio.Portfolio5.model.proyectos;
import com.Portfolio.Portfolio5.repository.proyectosrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class portfolioservice implements iportfolioservice{

    @Autowired
    public proyectosrepository ProyectosRepo;
    
/*------------MÉTODOS PARA LA SECCION "PROYECTOS REALIZADOS------------------"*/    
    @Override
    public void AgregarProyecto(proyectos proy) {
        
        ProyectosRepo.save(proy);
        
    }

    @Override
    public List<proyectos> VerProyectos() {
       return  ProyectosRepo.findAll();
    }
    
    
}
