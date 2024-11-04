package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatc.modelos.Clasificacion;

public class Recomendacion {
    public void filtro (Clasificacion clasificacion){
        if (clasificacion.getClasificacion()>=4){
            System.out.println("¡Lo mejor del Momento!");
        }else if (clasificacion.getClasificacion()>=2) {
            System.out.println("¡Lo Más Popular!");
        }else {
            System.out.println("Agregar a tu lista para ver despues");
        }
    }
}
