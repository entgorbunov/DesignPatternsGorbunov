package org.example.basepatterns.behavioral.observer;

import org.example.basepatterns.behavioral.mediator.User;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        YoutubeUser user1 = new YoutubeUser();
        YoutubeUser user2 = new YoutubeUser();
        YoutubeUser user3 = new YoutubeUser();
        youtubeChannel.addSubscriber(user1);
        youtubeChannel.addSubscriber(user2);
        youtubeChannel.addSubscriber(user3);
        youtubeChannel.uploadNewVideo("Observer");

    }


}
