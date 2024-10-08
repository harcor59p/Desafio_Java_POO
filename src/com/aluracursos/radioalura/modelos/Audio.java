package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo ;
    private int totalDeReproducciones ;
    private int totalDeMeGusta ;
    private int clasificacion ;
    private double duracionEnMinutos ;
    private String genero ;


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(double duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta(){
        this.totalDeMeGusta++ ;
    }

    public void reproduce(){
        this.totalDeReproducciones++;
    }
}
