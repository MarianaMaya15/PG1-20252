package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Mecanico {
    private String nombre;
    private String cedula;
    private String telefono;
    private ArrayList<Orden> listaOrdenes;

    public Mecanico(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listaOrdenes = new ArrayList<>();

    }

    public void asignarOrden(Orden orden) {listaOrdenes.add(orden);}

    public void actualizarEstadoOrden(String estado, int id){
        for (Orden ord : listaOrdenes){
            if(ord.getId()==id){
                ord.setEstado(estado);
            }
        }
    }
    public void eliminarOrden(int id){
        for (int i = 0; i < listaOrdenes.size(); i++){
            if(listaOrdenes.get(i).getId()==id){
                listaOrdenes.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listOrdendeServicioMecanico=" + listaOrdenes +
                '}';
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}




