package com.esi.designpatterns;

import java.util.Timer;
import java.util.TimerTask;

public class OpenState implements DoorState {
    private Timer timer;

    public OpenState() {
        // Simulation of automatic timeout after 2 seconds
        timer = new Timer();
    }

    @Override
    public void touch(DoorController controller) {
        if (timer != null) timer.cancel();
        controller.setState(new StayOpenState());
    }

    @Override
    public void complete(DoorController controller) { /* ignore */ }

    @Override
    public void timeout(DoorController controller) {
        controller.setState(new ClosingState());
    }

    public void startAutoClose(DoorController controller) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                controller.timeout();
            }
        }, 2000);
    }

    @Override
    public String getStatus() { return "OPEN"; }
}
