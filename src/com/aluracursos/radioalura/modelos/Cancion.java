package com.aluracursos.radioalura.modelos;

public class Cancion extends Audio {
    private String Autor ;
    private String Cantante ;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 5000) {
            return  8;

        } else {
            return 4;
        }
    }

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
