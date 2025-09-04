package co.uniquindio.poo.model;

public class Cita {
    // Atributos
    private String fecha;
    private String hora;

    // Relaciones de asociación
    private Mascota theMascota;
    private Veterinario theVeterinario;

    /**
     * Constructor de la clase Cita
     * @param fecha de la cita
     * @param hora de la cita
     * @param theMascota asignada a la cita
     * @param theVeterinario que atiende la cita
     */
    public Cita(String fecha, String hora, Mascota theMascota, Veterinario theVeterinario){
        this.fecha=fecha;
        this.hora=hora;
        this.theMascota=theMascota;
        this.theVeterinario=theVeterinario;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", theMascota=" + theMascota +
                ", theVeterinario=" + theVeterinario +
                '}';
    }

    // Métodos Getters y Setters

    /**
     * Obtiene la fecha de la ita
     * @return fecha cita
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la cita
     * @param fecha de la cita
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora de la cita
     * @return hora de la cita
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la hora de la cita
     * @param hora de la cita
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene la mascota asociada a la cita
     * @return objeto {@link Mascota} correspondiente a la cita
     */
    public Mascota getTheMascota() {
        return theMascota;
    }

    /**
     * Asigna la mascota a la cita
     * @param theMascota objeto {@link Mascota} que participa en la cita
     */
    public void setTheMascota(Mascota theMascota) {
        this.theMascota = theMascota;
    }

    /**
     * Obtiene el veterinario encargado de la cita
     * @return objeto {@link Veterinario} asignado a la cita
     */
    public Veterinario getTheVeterinario() {
        return theVeterinario;
    }

    /**
     * Asigna el veterinario a la cita
     * @param theVeterinario objeto {@link Veterinario} encargado de la cita
     */
    public void setTheVeterinario(Veterinario theVeterinario) {
        this.theVeterinario = theVeterinario;
    }
}


