package com.uco.maquina_dispensadora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
    private List<Contenido> snacks;

    public Maquina(){this.snacks= new ArrayList<>();}

    public void agregar_snack(String nombre, int codigo){
        this.snacks.add(new Contenido(nombre,codigo));
    }

    public List<Contenido> getSnacks() {
        return snacks;
    }
}
