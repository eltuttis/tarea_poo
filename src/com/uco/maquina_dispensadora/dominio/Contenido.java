package com.uco.maquina_dispensadora.dominio;

public class Contenido {
    private String nombre;
    private int codigo;
    private int cantidad;
    protected long valor;

    public Contenido(String nombre, int codigo,int cantidad,long valor){
        this.nombre=nombre;
        this.codigo=codigo;
        this.cantidad=cantidad;
        this.valor=valor;
    }

    public String getNombre() {return nombre;}

    public int getCodigo() {
        return codigo;
    }
    public int getCantidad() {return cantidad;}
    public long getValor() {return valor;}

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
