package com.stopThread;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StopThread  implements Runnable{
    private static Logger logger = LogManager.getLogger();
    private Boolean flag = true;
    @Override
    public void run() {
        while (flag) {
//            System.out.println("run.............");
            logger.error("线程正在运行。。。。。。。");
        }
    }
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        StopThread stopThread =  new StopThread();
        new Thread(stopThread).start();
        for (int i = 0; i < 1000; i++) {
            if (i==900){
                stopThread.stop();
                System.out.println("stop.............");
            }
        }
    }
}
