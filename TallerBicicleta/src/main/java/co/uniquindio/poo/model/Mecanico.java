package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Mecanico {
    private String nombre;
    private String cedula;
    private String telefono;
    private List<Ordendeservicio> listOrdendeServicioMecanico;

    public Mecanico(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listOrdendeServicio = new ArrayList<>();

    }

    public void asignarOrdenMecanico(OrdendeServicio ordendeServicio) {listOrdendeServicioMecanico.add(ordendeServicio);}

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listOrdendeServicioMecanico=" + listOrdendeServicioMecanico +
                '}';
    }


}

