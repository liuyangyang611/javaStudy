package com.ThreadDemo;

public class Main {
    public static void main(String[] args) {
        Race thread = new Race();
        new Thread(thread,"乌龟").start();
        new Thread(thread,"兔子").start();

    }
}
