package org.example.basepatterns.behavioral.mediator;

public class SimpleUser implements User{
    Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }
    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Пользователь получает сообщение '" + message + "'");
    }
}
