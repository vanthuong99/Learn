package org.example;

public class Main {
    public static void main(String[] args) {
        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LoggerSingleton.getInstance().log();
            }
        });
        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LoggerSingleton.getInstance().log();
            }
        });
        thread_1.start();
        thread_2.start();
    }
}
