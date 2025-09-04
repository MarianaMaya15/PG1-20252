package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Bicicleta {
    private String marca;
    private int id;
    private Cliente theCliente;
    private ArrayList<Orden> listaOrdenes;

    public Bicicleta(String marca, int id, Cliente theCliente) {
        this.marca = marca;
        this.id = id;
        this.theCliente = theCliente;
        this.listaOrdenes = new ArrayList<>();
    }
    public String getMarca() {return marca;}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public  void  registrarOrden(Orden orden){
        listaOrdenes.add(orden);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public Cliente getTheCliente() {
        return theCliente;
    }

    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }
}
