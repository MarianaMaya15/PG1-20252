package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Veterinario{
    // Atributos
    private String nombre;
    private String cedula;
    private String telefono;

    // Relaciones de asociación
    private List<Cita> listCitasVeterinario;

    /**
     * Constructor de la clase Veterinario
     * @param nombre del veterinario
     * @param cedula del veterinario
     * @param telefono del veterinario
     */
    public Veterinario(String nombre, String cedula, String telefono){
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.listCitasVeterinario = new ArrayList<>();
    }

    /**
     * Metodo que permite asignarle citas al veterinario
     * @param cita
     */
    public void asignarCitaVeterinario(Cita cita){
        listCitasVeterinario.add(cita);
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    // Métodos Getters y Setters

    /**
     * Obtiene el nombre del veterinario
     * @return nombre del veterinario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del veterinario
     * @param nombre nombre del veterinario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cédula del veterinario
     * @return cédula del veterinario
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece la cédula del veterinario
     * @param cedula cédula del veterinario
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el número de teléfono del veterinario
     * @return teléfono del veterinario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del veterinario
     * @param telefono de contacto del veterinario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la lista de citas asociadas al veterinario
     * @return lista de objetos {@link Cita} correspondientes al veterinario
     */
    public List<Cita> getListCitasVeterinario() {
        return listCitasVeterinario;
    }

    /**
     * Establece la lista de citas del veterinario
     * @param listCitasVeterinario lista de objetos {@link Cita} atendidas por el veterinario
     */
    public void setListCitasVeterinario(List<Cita> listCitasVeterinario) {
        this.listCitasVeterinario = listCitasVeterinario;
    }
}
