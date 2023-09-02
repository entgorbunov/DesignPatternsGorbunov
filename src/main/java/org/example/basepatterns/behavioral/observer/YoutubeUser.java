package org.example.basepatterns.behavioral.observer;

public class YoutubeUser implements Subscriber {
    @Override
    public void showNotification(String text) {
        System.out.println("Вышло новое видео: " + text);
    }
}
