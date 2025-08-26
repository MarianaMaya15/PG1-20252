package co.uniquindio.poo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Cita {
    private String lugar;
    private LocalDateTime fecha;
    private int id;
    private List<Mascota> listMascotas;
    private Veterinario veterinario;

    public Cita(String lugar, LocalDateTime fecha, int id) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.id = id;
        this.listMascotas = new ArrayList<>();

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

    public void agregarVeterinario(Veterinario veterinario){
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Cita{" +
                "lugar='" + lugar + '\'' +
                ", fecha=" + fecha.format(formato) +
                ", id=" + id +
                ", mascotas=" + listMascotas +
                ", veterinario=" + veterinario +
                '}';
    }
}
