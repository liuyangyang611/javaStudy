package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime implements Runnable{
    private static Logger logger = LogManager.getLogger();
    public static String startTime = new SimpleDateFormat("YYYY--MM--dd-HH-mm-ss").format(new Date());
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.error(startTime);
            startTime = new SimpleDateFormat("YYYY--MM--dd-HH-mm-ss").format(new Date());;
        }
    }

    public static void main(String[] args) {
        ThreadTime threadTime = new ThreadTime();
        new Thread(threadTime,"时间").start();
    }
}
