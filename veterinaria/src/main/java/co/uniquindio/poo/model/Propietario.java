package co.uniquindio.poo.model;

public class Propietario {
    private String nombre, id, telefono, email;

    public Propietario(String nombre, String id, String telefono, String email) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + id + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
