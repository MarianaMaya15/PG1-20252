package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Taller {
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;

    private ArrayList<Mecanico> mecanicos;
    private ArrayList<Orden> ordenes;
    private ArrayList<Bicicleta> bicicletas;
    private  ArrayList<Cliente> clientes;
    private ArrayList<Repuesto> repuestos;

    public Taller(String direccion, String nit, String nombre, String telefono) {
        this.direccion = direccion;
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.bicicletas=new ArrayList<>();
        this.clientes=new ArrayList<>();
        this.ordenes=new ArrayList<>();
        this.mecanicos=new ArrayList<>();
        this.repuestos=new ArrayList<>();
    }


    public  void registrarBicicletas(Bicicleta bici){
        bicicletas.add(bici);
    }
    public void registrarCliente(Cliente cli){
        clientes.add(cli);
    }
    public  void registrarOrden(Orden orden){
        ordenes.add(orden);
    }
    public  void  registarMecanicos(Mecanico meca){
        mecanicos.add(meca);
    }
    public void  registrarRepuesto(Repuesto rep){repuestos.add(rep);}

    @Override
    public String toString() {
        return "Taller{" +
                "bicicletas=" + bicicletas +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mecanicos=" + mecanicos +
                ", ordenes=" + ordenes +
                ", clientes=" + clientes +
                '}';
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
