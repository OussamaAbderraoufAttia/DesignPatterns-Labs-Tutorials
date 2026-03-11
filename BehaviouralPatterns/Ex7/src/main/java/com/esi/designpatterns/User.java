package com.esi.designpatterns;

public abstract class User {
    protected ChatRoom mediator;
    protected String name;

    public User(ChatRoom mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
