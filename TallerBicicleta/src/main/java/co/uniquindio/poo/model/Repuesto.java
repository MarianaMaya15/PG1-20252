package co.uniquindio.poo.model;

public class Repuesto {
    private int id;
    private String nombre;
    private int cantidad;
    private  Double costounitario;

    public Repuesto(int cantidad, Double costounitario, int id, String nombre) {
        this.cantidad = cantidad;
        this.costounitario = costounitario;
        this.id = id;
        this.nombre = nombre;
    }

    public Double calcularCosto(){
        Double costo=cantidad*costounitario;
        return  costo;
    }
}
