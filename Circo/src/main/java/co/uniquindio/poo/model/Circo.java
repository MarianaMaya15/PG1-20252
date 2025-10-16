package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Circo {
    private String nombre, lugar;
    private int nit;

    //listas
    private List<Cliente> listClientes;
    private List<Funcion> listFunciones;
    private List<Artista> listArtistas;
    private List<Acto> listActos;

    public Circo(String nombre, String lugar, int nit) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.nit = nit;
        this.listArtistas = new ArrayList<>();
        this.listFunciones = new ArrayList<>();
        this.listActos = new ArrayList<>();
        this.listClientes = new ArrayList<>();
    }

    public void crearArtista(Artista artista) {
        listArtistas.add(artista);
    }

    public boolean verificarArtista(Artista artista) {
        boolean bandera = false;
        for (Artista artist : listArtistas) {
            if (artist.getId().equals(artista.getId())) {
                bandera = true;
            }
        }
    return bandera;
    }
        public void crearCliente (Cliente cliente){
            listClientes.add(cliente);
        }
        public boolean verificarCliente (Cliente cliente){
            boolean bandera = false;
            for (Cliente client : listClientes) {
                if(client.getId().equals(cliente.getId())) {
                    bandera = true;
                }
            }
            return bandera;
        }
        public int getNit () {
            return nit;
        }
        public void crearFuncion (Funcion funcion){
            listFunciones.add(funcion);
        }
        public boolean verificarFunciones (Funcion funcion) {
            boolean bandera = false;
            for (Funcion funci : listFunciones) {
                if (funci.getId().equals(funcion.getId())) {
                    bandera = true;
                }
            }
            return bandera;
        }
        public void crearActo (Acto acto){listActos.add(acto);}
    public boolean verificarActo(Acto acto){
        boolean bandera = false;
        for(Acto act : listActos){
            if(act.getId().equals(acto.getId())){
                bandera = true;
            }
        }
        return bandera;
    }
    }


