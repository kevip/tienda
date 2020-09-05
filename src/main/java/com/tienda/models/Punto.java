package com.tienda.models;

public abstract class Punto {

    private double latitud;
    private double longitud;

    public Punto(double lon, double lat){
        latitud = lat;
        longitud = lon;
    }

