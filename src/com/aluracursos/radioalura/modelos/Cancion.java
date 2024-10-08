package com.aluracursos.radioalura.modelos;

public class Cancion extends Audio {
    private String Autor ;
    private String Cantante ;

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getCantante() {
        return Cantante;
    }

    public void setCantante(String cantante) {
        Cantante = cantante;
    }
}
