package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadJoin {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Join join = new Join();
        Thread thread = new Thread(join,"join线程");
        thread.start();
        for (int i = 0; i < 1000; i++) {
            if (i==100){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            logger.error("main线程执行"+i);
        }
    }

}
class Join implements Runnable{
    private static Logger logger = LogManager.getLogger();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            logger.error(Thread.currentThread().getName()+"run------"+i);
        }
    }
}