package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private String fecha;
    private String hora;
    private String id;
    private List<Artista> listArtistas;
    private List<Cliente> listClientes;

    public Funcion(String fecha, String hora, String id) {
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.listArtistas = new ArrayList<Artista>();
        this.listClientes = new ArrayList<Cliente>();
    }
    public boolean verificarCliente(Cliente cliente){
        boolean bandera = false;
        for(Cliente clien:listClientes){
            if(clien.equals(cliente)){
                bandera=true;
            }
        }
        return bandera;
    }
    public void agregarCliente (Cliente cliente){
        if(!verificarCliente(cliente)){
            listClientes.add(cliente);
            System.out.println ("se agregó");
        }else{
            System.out.println ("Ya existe un cliente con ese nombre");
        }
    }
    public String getId(){
        return id;
    }
}
