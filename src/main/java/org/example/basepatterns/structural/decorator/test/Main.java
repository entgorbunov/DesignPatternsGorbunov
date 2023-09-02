package org.example.basepatterns.structural.decorator.test;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification(new SmsNotification(
                new MessengerNotification()));
        sendNotification(emailNotification);



    }

    private static void sendNotification(Notification notification) {
        notification.send();
    }


}
