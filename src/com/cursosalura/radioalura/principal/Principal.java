package com.cursosalura.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion() ;
        miCancion.setTitulo("Senderito de Amor");
        miCancion.setAutor("Julio Jaramirllo");
        miCancion.setCantante("Julio Jaramillo");
        miCancion.setGenero("Popular");
        miCancion.setDuracionEnMinutos(4.15) ;
    }

}
