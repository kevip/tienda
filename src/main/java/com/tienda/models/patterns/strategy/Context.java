package com.tienda.models.patterns.strategy;

import com.tienda.models.Ruta;

public class Context {
    private RutaStrategy strategy;

    public void setStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public Ruta crearRuta(){
        return this.strategy.crearRuta();
    }
}