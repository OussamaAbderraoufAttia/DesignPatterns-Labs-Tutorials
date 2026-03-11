package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class BasicChatRoom implements ChatRoom {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for (User u : users) {
            // Send to everyone except the sender
            if (u != sender) {
                u.receive("[" + sender.name + "]: " + msg);
            }
        }
    }
}
