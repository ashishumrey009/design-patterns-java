package com.designpatterns.src.main.java.com.designpatterns.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to get the singleton instance.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}