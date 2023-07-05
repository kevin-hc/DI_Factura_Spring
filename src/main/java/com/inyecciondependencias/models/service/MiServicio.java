package com.inyecciondependencias.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // por defecto...Permite seleccionar el bean principal cuando hay mas de 1 bean en el contenedor
@Service("miServicioSimple") // Es un servicio de springboot pero es lo mismo que @Component , solo que se usa para indicar que es un servicio, una semantica mas correcta
public class MiServicio implements IServicio {
    @Override // Sobreescribimos el metodo operacion de la interfaz IServicio
    public String operacion() {
        return "Ejecutando algun proceso importante simple...";
    }

    /* public String operacion() {
        return "Ejecutando algun proceso importante ...";

    }*/
}