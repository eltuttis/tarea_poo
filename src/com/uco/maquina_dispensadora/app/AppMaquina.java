package com.uco.maquina_dispensadora.app;

import com.uco.maquina_dispensadora.dominio.Contenido;
import com.uco.maquina_dispensadora.dominio.Maquina;

public class AppMaquina {
    public static void main(String[] args) {
        Maquina miMaquina = new Maquina();
        miMaquina.agregar_snack("papitas",1);
        miMaquina.agregar_snack("rosquitas",2);
        miMaquina.agregar_snack("Doritos",3);

        miMaquina.getSnacks().forEach(c-> System.out.println(c.getNombre()+" "+c.getCodigo()));

    }
}
