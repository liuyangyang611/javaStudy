package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadYield {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Yield yield = new Yield();
        new Thread(yield,"A").start();
        new Thread(yield,"B").start();

    }
}

class Yield implements Runnable{
    private static Logger logger = LogManager.getLogger();
    @Override
    public void run() {
        logger.error(Thread.currentThread().getName()+"线程run。。。。。。。。。。。。。。");
//        Thread.yield();
        logger.error(Thread.currentThread().getName()+"线程stop.......................");
    }
}