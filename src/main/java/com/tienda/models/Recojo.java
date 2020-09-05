package com.tienda.models;

public class Recojo extends Punto {

    private String direccion;
    private String comentarios;

    public Recojo(double lon, double lat) {
        super(lon, lat);
    }

    public Recojo(double lon, double lat, String direccion, String comentarios) {
        super(lon, lat);
        this.direccion = direccion;
        this.comentarios = comentarios;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getComentarios(){
        return comentarios;
    }



}