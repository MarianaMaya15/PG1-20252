package co.uniquindio.poo.model;

import java.util.List;

public class Artista {
    private String nombre, id, tipoArtista;
    private int edad;
    private List<Acto> actos;




    public Artista (String nombre, String tipoArtista, int edad, String id, List<Acto> actos) {
        this.nombre= nombre;
        this.tipoArtista=tipoArtista;
        this.edad=edad;
        this.id = id;
        this.actos=actos;
    }

    public String getId() {
        return id;
    }

    public List<Acto> getActos() {
        return actos;
    }

}
