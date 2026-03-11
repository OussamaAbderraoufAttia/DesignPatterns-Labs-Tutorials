package com.esi.designpatterns;

public interface ChatRoom {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
