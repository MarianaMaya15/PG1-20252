package co.uniquindio.poo.model;

public class Veterinario {
    private String nombre, cedula;

    public Veterinario(String nombre, String cedula) {
        this.nombre=nombre;
        this.cedula=cedula;
    }

    @Override
    public String toString() {
        return "veterinario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}

