package org.example;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class LoggerSingleton {
    private static LoggerSingleton loggerInstance;
    private int number;
    private static final ReentrantLock lock = new ReentrantLock();

    private LoggerSingleton(int number) {
        this.number = number;
    }

    public static LoggerSingleton getInstance() {
        if (loggerInstance != null) {
            return loggerInstance;
        }
        lock.lock();
        if (loggerInstance == null) {
            Random random = new Random();
            loggerInstance = new LoggerSingleton(random.nextInt(100));
        }
        lock.unlock();
        return loggerInstance;
    }

    public void log() {
        System.out.printf("Hello, i am singleton class instance number %s\n", this.number);
    }
}
