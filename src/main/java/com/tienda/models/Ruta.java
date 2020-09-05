package com.tienda.models;

import java.util.ArrayList;

public class Ruta {

    private ArrayList<Punto> puntos = new ArrayList<Punto>();
    //private Conductor conductor;

    public void addPunto(Punto punto){
        puntos.add(punto);
    }

    public ArrayList<String> getPuntos(){
        return puntos;
    }

}