package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class DoorController {
    private DoorState state;
    private List<Observer> observers = new ArrayList<>();

    public DoorController() {
        this.state = new ClosedState();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setState(DoorState state) {
        this.state = state;
        notifyObservers();
        
        // Handle auto-close logic if entering OpenState
        if (state instanceof OpenState) {
            ((OpenState) state).startAutoClose(this);
        }
    }

    public void touch() {
        state.touch(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void timeout() {
        state.timeout(this);
    }

    public String getStatus() {
        return state.getStatus();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(getStatus());
        }
    }
}
