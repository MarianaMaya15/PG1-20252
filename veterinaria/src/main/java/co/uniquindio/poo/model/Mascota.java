package co.uniquindio.poo.model;

public class Mascota {
    private String nombre, raza;
    private int id, edad;
    private Propietario propietario;

    public Mascota(String nombre, String raza, int id, int edad, Propietario propietario) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.edad = edad;
        this.propietario =propietario;
    }
    public int getId(){
        return id;
    }
    public  Propietario getPropietario(){
        return propietario;
    }
    @Override
    public String toString() {
        return "mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", id=" + id +
                ", edad=" + edad +
                ", propietario=" + propietario +
                '}';
    }

}
