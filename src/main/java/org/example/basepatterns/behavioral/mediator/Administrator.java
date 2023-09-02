package org.example.basepatterns.behavioral.mediator;

public class Administrator implements User {
    Chat chat;

    public Administrator(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Администратор получает сообщение '" + message + "'");
    }
}
