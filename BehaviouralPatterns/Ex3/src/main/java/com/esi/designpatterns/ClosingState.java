package com.esi.designpatterns;

public class ClosingState implements DoorState {
    @Override
    public void touch(DoorController controller) {
        controller.setState(new OpeningState());
    }

    @Override
    public void complete(DoorController controller) {
        controller.setState(new ClosedState());
    }

    @Override
    public void timeout(DoorController controller) { /* ignore */ }

    @Override
    public String getStatus() { return "CLOSING"; }
}
