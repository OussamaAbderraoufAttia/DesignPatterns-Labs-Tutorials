package com.esi.designpatterns;

public class ClosedState implements DoorState {
    @Override
    public void touch(DoorController controller) {
        controller.setState(new OpeningState());
    }

    @Override
    public void complete(DoorController controller) { /* ignore */ }

    @Override
    public void timeout(DoorController controller) { /* ignore */ }

    @Override
    public String getStatus() { return "CLOSED"; }
}
