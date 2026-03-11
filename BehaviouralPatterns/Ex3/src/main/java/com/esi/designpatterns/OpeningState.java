package com.esi.designpatterns;

public class OpeningState implements DoorState {
    @Override
    public void touch(DoorController controller) {
        controller.setState(new ClosingState());
    }

    @Override
    public void complete(DoorController controller) {
        controller.setState(new OpenState());
    }

    @Override
    public void timeout(DoorController controller) { /* ignore */ }

    @Override
    public String getStatus() { return "OPENING"; }
}
