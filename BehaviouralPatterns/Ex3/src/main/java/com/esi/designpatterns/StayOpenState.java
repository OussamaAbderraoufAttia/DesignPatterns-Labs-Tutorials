package com.esi.designpatterns;

public class StayOpenState implements DoorState {
    @Override
    public void touch(DoorController controller) {
        controller.setState(new ClosingState());
    }

    @Override
    public void complete(DoorController controller) { /* ignore */ }

    @Override
    public void timeout(DoorController controller) { /* ignore */ }

    @Override
    public String getStatus() { return "STAY OPEN"; }
}
