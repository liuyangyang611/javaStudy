package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Poll poll = new Poll();
        service.execute(poll);
        service.execute(poll);
        service.execute(poll);
        service.execute(poll);
        service.shutdown();
    }
}

 class  Poll implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"running.........");
    }
}