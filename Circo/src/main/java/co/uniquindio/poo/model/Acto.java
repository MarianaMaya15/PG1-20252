package co.uniquindio.poo.model;

public class Acto {
    private String tipoActo, descripcion, hora;
    private int id;

    public Acto (String tipoActo, String descripcion, int id,String hora) {
        this.tipoActo =  tipoActo;
        this.descripcion =  descripcion;
        this.id = id;
        this.hora = hora;
    }
    public int id() {
        return id;
    }
    public String getHora() {
        return hora;
    }

}
