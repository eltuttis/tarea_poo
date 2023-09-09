package com.uco.maquina_dispensadora.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Maquina {
    public static final int CANTIDAD_MAXIMA = 6;
    private List<Contenido> snacks;

    public Maquina() {
        this.snacks = new ArrayList<>();
    }
    // AGREGAR Y ELIMINAR SNACK
    public void agregarSnack(String nombre, int codigo, int cantidad, long valor) {
        this.snacks.add(new Contenido(nombre, codigo, cantidad, valor));
    }
    public boolean eliminar(int codigo) {
        Contenido snackExistente = buscar(codigo);

        if (snackExistente != null) {
            this.snacks.remove(snackExistente);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre) {
        Contenido snackExistente = buscar(nombre);

        if (snackExistente != null) {
            this.snacks.remove(snackExistente);
            return true;
        }
        return false;
    }
    //AUMENTAR Y DISMINUIR CANTIDAD DE UN SNACK
    public boolean aumentarCantidad(int codigo){
        for (Contenido snack : snacks ){
            if (snack.getCodigo()==codigo){
                int cantidadActual = snack.getCantidad();
                if (cantidadActual < CANTIDAD_MAXIMA){
                    snack.setCantidad((cantidadActual+1));
                    return true;
                }
            };

        }
        return false;
    }
    public boolean aumentarCantidad(String nombre){
        for (Contenido snack : snacks ){
            if (snack.getNombre().equalsIgnoreCase(nombre)){
                int cantidadActual = snack.getCantidad();
                if (cantidadActual < CANTIDAD_MAXIMA){
                    snack.setCantidad((cantidadActual+1));
                    return true;
                }
            };

        }
        return false;
    }
    public boolean disminuirCantidad(int codigo){
        for (Contenido snack : snacks ){
            if (snack.getCodigo()==codigo){
                int cantidadActual = snack.getCantidad();
                if (cantidadActual != 0){
                    snack.setCantidad((cantidadActual-1));
                    return true;
                }
            };

        }
        return false;
    }
    public boolean disminuirCantidad(String nombre){
        for (Contenido snack : snacks ){
            if (snack.getNombre().equalsIgnoreCase(nombre)){
                int cantidadActual = snack.getCantidad();
                if (cantidadActual !=0){
                    snack.setCantidad((cantidadActual-1));
                    return true;
                }
            };

        }
        return false;
    }

    //BUSCAR
    public Contenido buscar(int codigo) {
        return this.snacks.stream()
                .filter(snack -> snack.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public Contenido buscar(String nombre) {
        return this.snacks.stream()
                .filter(snack -> snack.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    public List<Contenido> getSnacks() {
        return snacks;
    }
    //IMPRIMIR
    public void imprimir(int codigo) {
        Contenido snackEncontrado = buscar(codigo);

        if (snackEncontrado != null) {
            System.out.println("Snack encontrado por código: " + snackEncontrado.getNombre());

        } else {
            System.out.println("Snack no encontrado por código " + codigo);
        }
    }
    public void imprimir(String nombre) {
        Contenido snackEncontrado = buscar(nombre);

        if (snackEncontrado != null) {
            System.out.println("Snack encontrado por código: " + snackEncontrado.getCodigo());

        } else {
            System.out.println("Snack no encontrado por código " + nombre);
        }
    }
    public List<Contenido> imprimirSnacksRestantes() {

        return this.snacks.stream()
                .filter(c -> c.getCantidad() !=0)
                .toList();

    }
    public List<Contenido> imprimirSnacksAgotados() {

        return this.snacks.stream()
                .filter(snack -> snack.getCantidad() ==0)
                .toList();

    }
    //ORDENAR
    public List<Contenido> ordenarValor(){
        this.snacks.sort(
                Comparator.comparing(Contenido::getValor).reversed()
        );
        return this.snacks;
    }
    public List<Contenido> ordenarCantidad(){
        this.snacks.sort(
                Comparator.comparing(Contenido::getCantidad)
        );
        return this.snacks;
    }
}
