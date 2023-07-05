package com.inyecciondependencias.controllers;

import com.inyecciondependencias.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Anotacion para indicar que es un controlador
public class IndexController {

   // private MiServicio servicio = new MiServicio() ; // Inyectamos la dependencia de la clase MiServicio sin springboot

  @Autowired // AUTOCABLEADO = Anotacion para indicar que es una inyeccion de dependencia
  @Qualifier("MiServicioComplejo") // Anotacion para indicar que es el servicio a ocupar. Independiente si hay ya una anotacion @Primary
   private IServicio servicio ; // Inyectamos la dependencia de la clase MiServicio con springboot

// @Autowired
    //private MiServicio servicio ; // Inyectamos la dependencia de la clase MiServicio con springboot

    @GetMapping({"/index","/",""})
    public  String index(Model model){
        model.addAttribute("objeto", servicio.operacion()); // Agregamos un atributo al modelo
        return "index";// Retornamos el nombre de la vista de la pagina index.html
    }




    // Getters y Setters

}
