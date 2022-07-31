
package com.Portfolio.Portfolio5.controller;

import com.Portfolio.Portfolio5.model.proyectos;
import com.Portfolio.Portfolio5.service.iportfolioservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class controller {
    
    @Autowired
    private iportfolioservice PortfolioServis;
    
/*------------MÉTODOS PARA LA SECCION "PROYECTOS REALIZADOS------------------"*/    
    @PostMapping("/agregarproyecto")
    public void AgregarProyecto(@RequestBody proyectos proy ){
        
        PortfolioServis.AgregarProyecto(proy); 
    }
    
    @GetMapping("/verproyectos")
    @ResponseBody
    public List<proyectos> VerProyectos(){

       return PortfolioServis.VerProyectos();
        
    }
    
    
    
    
    
}
