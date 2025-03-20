package com.designpatterns.src.main.java.com.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
        singleton1.showMessage();
    }
}