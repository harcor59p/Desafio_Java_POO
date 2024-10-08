package com.cursosalura.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion() ;
        miCancion.setTitulo("Senderito de Amor");
        miCancion.setAutor("Julio Jaramirllo");
        miCancion.setCantante("Julio Jaramillo");
        miCancion.setGenero("Popular");
        miCancion.setDuracionEnMinutos(4.15) ;

        Podcast miPodcast = new Podcast() ;
        miPodcast.setDescripcion("Feminismo del Siglo XXI");
        miPodcast.setTitulo("Feminismo");
        miPodcast.setDuracionEnMinutos(120);

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();

        }

        for (int i = 0; i < 5000 ; i++) {
            miCancion.reproduce();

        }
        System.out.println("Total de Reproducciones " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta " + miCancion.getTotalDeMeGusta());
    }

}
