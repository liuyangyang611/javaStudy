package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadDaemon {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        Thread  thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(you).start();

    }
}

class You implements Runnable{
    private static Logger logger = LogManager.getLogger();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
           logger.error("i am ok");
        }
        logger.error("goodbye world");
    }
}
class God implements Runnable{
    private static Logger logger = LogManager.getLogger();
    @Override
    public void run() {
        while(true){
        logger.error("god is running.........");
        }
    }
}