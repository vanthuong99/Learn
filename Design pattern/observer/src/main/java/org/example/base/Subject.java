package org.example.base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<ObserverNotifier> observerNotifiers = new ArrayList<>();

    public void attachObserve(ObserverNotifier observerNotifier) {
        this.observerNotifiers.add(observerNotifier);
    }

    public void detachObserve(ObserverNotifier observerNotifier) {
        this.observerNotifiers.remove(observerNotifier);
    }

    public void notifyObserves() {
        this.observerNotifiers.forEach(observer -> observer.notify(this));
    }
}
