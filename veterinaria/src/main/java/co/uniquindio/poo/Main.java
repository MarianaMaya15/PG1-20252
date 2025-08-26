package co.uniquindio.poo;

import co.uniquindio.poo.model.Mascota;
import co.uniquindio.poo.model.Cita;
import co.uniquindio.poo.model.Veterinario;
import co.uniquindio.poo.model.Propietario;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
    Veterinario veterinario = new Veterinario("juan","123");
    Veterinario veterinario2 = new Veterinario("pato","1233");

    Propietario propietario = new Propietario("Jose","222","1213131","jchwiheidhwi");
    Propietario propietario1 = new Propietario("luis","3231","1323313","ajsdjadaj");

    LocalDateTime fecha1 = LocalDateTime.of(2025,9,15,11,40);
    Cita cita1 = new Cita("Sagrada fa",fecha1,1009,veterinario);


    LocalDateTime fecha2 = LocalDateTime.of(2025,9,15,12,40);
    Cita cita2 = new Cita("Sagrada fa",fecha2,1008,veterinario2);


    Mascota mascota = new Mascota("farruko","gato",5 ,3,propietario);
    Mascota mascota1 = new Mascota("farruko","gato",5,3,propietario1);

    cita1.agregarMascotaCita(mascota);
    cita2.agregarMascotaCita(mascota1);

    System.out.println(cita1.toString());
    System.out.println(cita2.toString());

    }
}