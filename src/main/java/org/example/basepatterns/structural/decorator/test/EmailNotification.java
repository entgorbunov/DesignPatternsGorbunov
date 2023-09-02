package org.example.basepatterns.structural.decorator.test;

public class EmailNotification implements Notification{
    private Notification notification;

    public EmailNotification() {
    }

    public EmailNotification(Notification notification) {
        this.notification = notification;
    }

    public void send() {
        if( notification != null) notification.send();
        System.out.println("Отправка email сообщений");
    }
}
