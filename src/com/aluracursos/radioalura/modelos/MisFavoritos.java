package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los favorito en el momento");
        }else {
            System.out.println(audio.getTitulo() + " Esta en proceso de ser un exito");
        }
    }
}
