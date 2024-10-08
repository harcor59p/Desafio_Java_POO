package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio{
    private String moderador ;
    private String descripcion ;

    public String getModerador() {
        return moderador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setModerador(String moderador) {
        this.moderador = moderador;
    }
}
