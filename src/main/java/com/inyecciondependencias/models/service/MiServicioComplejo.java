package com.inyecciondependencias.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("MiServicioComplejo")
//@Primary // Anotacion para indicar que es el servicio principal y no ser ambiguo al haber mas de 1 bean en el contenedor
public class MiServicioComplejo implements IServicio {
    @Override
    public String operacion() {

        return "Ejecutando algun proceso importante complicado...";
    }


}