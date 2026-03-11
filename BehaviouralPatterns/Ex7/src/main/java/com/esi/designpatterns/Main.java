package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new BasicChatRoom();

        User u1 = new ChatUser(chatRoom, "Oussama");
        User u2 = new ChatUser(chatRoom, "Ahmed");
        User u3 = new ChatUser(chatRoom, "Sara");

        chatRoom.addUser(u1);
        chatRoom.addUser(u2);
        chatRoom.addUser(u3);

        u1.send("Hello everyone!");
        System.out.println();
        u2.send("Hi Oussama, how are you?");
    }
}
