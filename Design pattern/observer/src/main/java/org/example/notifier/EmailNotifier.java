package org.example.notifier;

import org.example.Video;
import org.example.base.ObserverNotifier;
import org.example.base.Subject;

public class EmailNotifier extends ObserverNotifier {
    public EmailNotifier(Subject subject) {
        this.subject = subject;
        this.subject.attachObserve(this);
    }

    @Override
    public void notify(Subject subject) {
        if (subject instanceof Video) {
            Video video = (Video) subject;
            System.out.printf("Notify to EMAIL via observer.\n- Title: %s\n- Name: %s\n- Author: %s\n", video.getTitle(), video.getName(), video.getAuthor());
        }
    }
}
