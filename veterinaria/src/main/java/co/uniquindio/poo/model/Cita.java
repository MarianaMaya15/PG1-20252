package co.uniquindio.poo.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Cita {
    private String lugar;
    private LocalDateTime fecha;
    private int id;
    private List<Mascota> listMascotas;
    private Veterinario veterinario;

    public Cita(String lugar, LocalDateTime fecha, int id, Veterinario veterinario) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.id = id;
        this.listMascotas = new ArrayList<>();
        this.veterinario= veterinario;

    }
    public boolean verificarMascota(Mascota mascota){
        boolean centinela = false;
        for(Mascota mas: listMascotas){
            if(mas.getId()==(mascota.getId())){
                centinela = true;
            }
        }
        return centinela;
    }


    public void agregarMascotaCita(Mascota mascota) {
        if (!verificarMascota(mascota)) {
            listMascotas.add(mascota);
            System.out.println("Se agregó la mascota con id " + mascota.getId());
        } else {
            System.out.println("Ya existe una mascota con el id " + mascota.getId());
        }
    }

    @Override
    public String toString() {
        return "Cita{" +
                "lugar='" + lugar + '\'' +
                ", fecha=" + fecha +
                ", id=" + id +
                ", listMascotas=" + listMascotas +
                ", veterinario=" + veterinario +
                '}';
    }
}
