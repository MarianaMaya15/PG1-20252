package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    // Atributos
    private String nombre;
    private String raza;
    private int id;

    // Relaciones de asociación
    private Propietario propietario;
    private List<Cita> listCitasMascota;

    /**
     * Constructor de la clase mascota
     * @param nombre de la mascota
     * @param raza de la mascota
     * @param id de la mascota
     * @param propietario de la mascota
     */
    public Mascota(String nombre, String raza, int id, Propietario propietario){
        this.nombre=nombre;
        this.raza=raza;
        this.id=id;
        this.propietario=propietario;
        this.listCitasMascota = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    // Métodos Getters y Setters

    /**
     * Obtiene el nombre de la mascota
     * @return nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la mascota
     * @param nombre de la mascota
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la raza de la mascota
     * @return raza de la mascota
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza de la mascota
     * @param raza de la mascota
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtiene el identificador único de la mascota
     * @return id de la mascota
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la mascota
     * @param id de la mascota
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el propietario asociado a la mascota
     * @return objeto {@link Propietario} de la mascota
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * Asigna el propietario de la mascota
     * @param propietario objeto {@link Propietario} dueño de la mascota
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * Obtiene la lista de citas asociadas a la mascota
     * @return lista de objetos {@link Cita} de la mascota
     */
    public List<Cita> getListCitasMascota() {
        return listCitasMascota;
    }

    /**
     * Establece la lista de citas asociadas a la mascota
     * @param listCitasMascota lista de objetos {@link Cita} de la mascota
     */
    public void setListCitasMascota(List<Cita> listCitasMascota) {
        this.listCitasMascota = listCitasMascota;
    }
}


