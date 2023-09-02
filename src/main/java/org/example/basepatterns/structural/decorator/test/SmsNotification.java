package org.example.basepatterns.structural.decorator.test;

public class SmsNotification implements Notification{
    private Notification notification;

    public SmsNotification() {
    }

    public SmsNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if( notification != null) notification.send();
        System.out.println("Отправка sms сообщения");
    }
}
