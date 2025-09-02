package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String cedula;
    private int telefono;
    private ArrayList<Bicicleta> listaBicicletas;

    public Cliente(String nombre, String cedula, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listaBicicletas = new ArrayList<>();

    }
    public void asignarBicicletaPropietario(Bicicleta bicicleta){listaBicicletas.add(bicicleta);}

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono=" + telefono +
                ", listBicicletasCliente=" + listaBicicletas +
                '}';
    }
    public String getCedula(String cedula) {return cedula;}
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Bicicleta> getListaBicicletas() {
        return listaBicicletas;
    }

    public void setListaBicicletas(ArrayList<Bicicleta> listaBicicletas) {
        this.listaBicicletas = listaBicicletas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

