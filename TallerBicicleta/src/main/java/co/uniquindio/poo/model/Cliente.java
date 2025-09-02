package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String cedula;
    private String correo;
    private int telefono;
    private List<Bicicleta> listBicicletasCliente;

    public Cliente(String nombre, String cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.listBicicletasCliente = new ArrayList<>();

    }
    public void asignarBicicletaPropietario(Bicicleta bicicleta){listBicicletasCliente,add(bicicleta);}

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", listBicicletasCliente=" + listBicicletasCliente +
                '}';
    }
    public String getCedula(String cedula) {return cedula;}
}
