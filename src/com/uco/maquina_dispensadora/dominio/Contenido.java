package com.uco.maquina_dispensadora.dominio;

public class Contenido {
    private String nombre;
    private int codigo;

    public Contenido(String nombre, int codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
}
