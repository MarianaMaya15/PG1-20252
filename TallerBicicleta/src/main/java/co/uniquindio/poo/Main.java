package co.uniquindio.poo;

import co.uniquindio.poo.model.Cliente;
import co.uniquindio.poo.model.Taller;
import co.uniquindio.poo.model.Mecanico;
import co.uniquindio.poo.model.Bicicleta;
import co.uniquindio.poo.model.Tarea;
import co.uniquindio.poo.model.Orden;
import co.uniquindio.poo.model.Repuesto;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Taller miTaller=new Taller("portal del quindio","123434534","solo ciclas","234234234324");


        Cliente cliente1=new Cliente("3242234","Kebyn","31130349534");
        Bicicleta bicicleta1=new Bicicleta("gg",1,cliente1);
        Mecanico mecanico1=new Mecanico("Alejo","31313131");

        Orden orden1=new Orden(bicicleta1,"tienes problas en rines y en la guaya","recibida","31/08/20025",1,20000.2,mecanico1);
        mecanico1.registrarOrden(orden1);
        Tarea tare1=new Tarea("cambiar rines",1);
        Tarea tare2=new Tarea("cambiar gusaya",2);

        miTaller.registarMecanicos(mecanico1);
        miTaller.registrarBicicletas(bicicleta1);
        miTaller.registrarCliente(cliente1);
        miTaller.registrarOrden(orden1);


        System.out.println(miTaller.getOrdenes());

        orden1.registrarTarea(tare1);
        orden1.registrarTarea(tare2);

        Repuesto repuesto1=new Repuesto(2,70000.0,1,"Rines");
        Repuesto repuesto2=new Repuesto(1,4000.0,2,"Guaya");
        orden1.registrarRepuesto(repuesto1);
        orden1.registrarRepuesto(repuesto2);

        System.out.println(orden1.costoTotal());
        System.out.println(orden1.getMecanicoAsignado().getNombre());
        System.out.println(orden1.getEstado());

        Mecanico mecanico2=new Mecanico("325353453535","tellez");

        orden1.setEstado("en proceso");
        orden1.setMecanicoAsignado(mecanico2);
        System.out.println(miTaller.getOrdenes());

        System.out.println(orden1.costoTotal());
        System.out.println(orden1.getMecanicoAsignado().getNombre());
        System.out.println(orden1.getEstado());


    }
}