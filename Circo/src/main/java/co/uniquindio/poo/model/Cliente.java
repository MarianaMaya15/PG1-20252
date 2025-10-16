package co.uniquindio.poo.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private String email;

    public Cliente(String nombre, String apellido, String id, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.email = email;
    }
    public String getId() {
        return id;
    }
}
