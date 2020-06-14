package com.thread;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Thread1{
   private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.error("这是main方法的线程名"+Thread.currentThread().getName());
        Thread thread = new Threadtest();
        logger.error("线程开始执行");
        thread.start();
        logger.error("线程执行结束");
        //使用匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
        logger.error("runable方法实现线程");
        logger.error(Thread.currentThread().getName());
            }
        };
        Thread thread1 =new Thread(runnable);
        Thread thread2 =new Thread(runnable);
        thread1.start();
        thread2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                logger.debug("aaa");
            }
        }).start();

    }
}
