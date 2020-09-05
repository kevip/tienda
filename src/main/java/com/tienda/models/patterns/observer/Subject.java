package com.tienda.models.patterns.observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Object> observers = new ArrayList<Object>();

    public void add(Observer obs) {
        observers.add(obs);
    }

    public void remove(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObs() {
        for (Object o: observers) {
            Observer observer = (Observer) o;
            observer.update();
        }
    }

}
