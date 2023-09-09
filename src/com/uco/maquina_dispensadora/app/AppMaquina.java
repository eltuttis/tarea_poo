package com.uco.maquina_dispensadora.app;

import com.uco.maquina_dispensadora.dominio.Contenido;
import com.uco.maquina_dispensadora.dominio.Maquina;

public class AppMaquina {
    public static void main(String[] args) {
        Maquina miMaquina = new Maquina();
        miMaquina.agregarSnack("papitas",1, 3, 4000);
        miMaquina.agregarSnack("rosquitas",2,6, 3000);
        miMaquina.agregarSnack("Doritos",3, 5,5000);
        miMaquina.agregarSnack("Submarino",4, 0,1500);
        miMaquina.agregarSnack("galletas",5, 6,1700);
        miMaquina.agregarSnack("cheestris",6, 0,4000);

        miMaquina.getSnacks().forEach(c-> System.out.println(c.getNombre()+" "+c.getCodigo()));
        /*miMaquina.imprimir("Papitas");
        miMaquina.imprimir(3);*/
        /*miMaquina.eliminar(2);*/
        System.out.println("Separacion___________________________-");
        /*miMaquina.getSnacks().forEach(c-> System.out.println(c.getNombre()+" "+c.getCodigo()));*/
        miMaquina.imprimirSnacksAgotados().forEach(c -> System.out.println(c.getNombre()));
        System.out.println("Separacion___________________________-");
        miMaquina.imprimirSnacksRestantes().forEach(c -> System.out.println(c.getNombre()+" "+ c.getCantidad()));
    }
}
