package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    private boolean isOpen;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setState(boolean isOpen) {
        this.isOpen = isOpen;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(isOpen);
        }
    }
}
