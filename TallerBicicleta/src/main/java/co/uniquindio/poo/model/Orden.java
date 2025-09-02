package co.uniquindio.poo.model;

import java.util.ArrayList;

public class Orden {

    private int id;
    private String fecha;
    private String descripcion;
    private String estado;
    private Bicicleta bicicleta;
    private Mecanico mecanicoAsignado;
    private Double manoDeObra;
    private ArrayList<Tarea> tareas;
    private ArrayList<Repuesto> repuestosUsados;

    public Orden(Bicicleta bicicleta, String descripcion, String estado, String fecha, int id, Double manoDeObra, Mecanico mecanicoAsignado){
        this.bicicleta = bicicleta;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha = fecha;
        this.id = id;
        this.manoDeObra = manoDeObra;
        this.mecanicoAsignado = mecanicoAsignado;
        this.tareas=new ArrayList<>();
        this.repuestosUsados=new ArrayList<>();
    }
    public  void cambiarMecanico(Mecanico nuevo){
        //logica cambio de mecanicos
        this.mecanicoAsignado.eliminarOrden(this.id);
        nuevo.registrarOrden(this);
        setMecanicoAsignado(nuevo);
    }
    public  void  cambiarEstado(String estadoNuevo){
        setEstado(estadoNuevo);
        this.mecanicoAsignado.actualizarEstadoOrden(estadoNuevo,this.id);

    }
    public  void  registrarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public  void  registrarRepuesto(Repuesto repuesto){
        repuestosUsados.add(repuesto);
    }

    public  Double costoTotal(){
        Double total=0.0;
        for (Repuesto rep : repuestosUsados){
            total+=rep.calcularCosto();
        }
        total+=manoDeObra;
        return total;

    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", bicicleta=" + bicicleta +
                ", mecanicoAsignado=" + mecanicoAsignado +
                ", manoDeObra=" + manoDeObra +
                ", tareas=" + tareas +
                ", repuestosUsados=" + repuestosUsados +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getManoDeObra() {
        return manoDeObra;
    }

    public void setManoDeObra(Double manoDeObra) {
        this.manoDeObra = manoDeObra;
    }

    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }

    public ArrayList<Repuesto> getRepuestosUsados() {
        return repuestosUsados;
    }

    public void setRepuestosUsados(ArrayList<Repuesto> repuestosUsados) {
        this.repuestosUsados = repuestosUsados;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
}


