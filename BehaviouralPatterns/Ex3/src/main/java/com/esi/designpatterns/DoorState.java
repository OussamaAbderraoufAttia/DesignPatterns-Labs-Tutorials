package com.esi.designpatterns;

public interface DoorState {
    void touch(DoorController controller);
    void complete(DoorController controller);
    void timeout(DoorController controller);
    String getStatus();
}
