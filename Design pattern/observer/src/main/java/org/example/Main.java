package org.example;

import org.example.notifier.EmailNotifier;
import org.example.notifier.PhoneNotifier;
import org.example.notifier.YoutubeNotifier;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        PhoneNotifier phoneNotifier = new PhoneNotifier(video);
        EmailNotifier emailNotifier = new EmailNotifier(video);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(video);
        video.setName("Tran Van Thuong");
        System.out.println("---------------------------------------------");
        video.detachObserve(emailNotifier);
        video.setTitle("Title ABC");
    }
}
