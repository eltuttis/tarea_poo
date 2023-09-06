package com.uco.agenda.app;

import com.uco.agenda.dominio.Agenda;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        miAgenda.ordenarAlfabeticamente().forEach(c -> System.out.println(c.getNombre() + " " + c.getApellido()));
        System.out.println("POR APELLIDO");
        miAgenda.buscarPorApellido("botEro").forEach(c -> System.out.println(c.getNombre()));


    }
}    
