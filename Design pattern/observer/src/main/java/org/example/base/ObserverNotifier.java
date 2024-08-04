package org.example.base;

public abstract class ObserverNotifier {
    public Subject subject;

    public abstract void notify(Subject subject);
}
