package org.example.basepatterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User admin = new Administrator(chat);
        User user1 = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        user1.sendMessage("Привет, я пользователь!");
        admin.sendMessage("Админ зашел в чат!");
    }



}
