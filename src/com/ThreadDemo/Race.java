package com.ThreadDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Race extends Thread {
    private static Logger logger = LogManager.getLogger();
//    public Race (String name){
//       Thread.currentThread().setName(name);
//    }
    int keep = 100;
    Object object;
    String winner;
    @Override
    public void run() {
        logger.error(Thread.currentThread().getName()+"开始时跑步");
        boolean flag = false;
            for (int step = 0;step <101; step++) {
                if (Thread.currentThread().getName().equals("兔子")){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                logger.error(Thread.currentThread().getName()+"跑了"+step+"米");
                flag = gameOver(step);
                if (flag){
                    break;
                }
            }
        logger.error(winner+"获得比赛胜利");

     }

    private boolean gameOver(int step) {
        if (winner!=null){
            return true;
        }else {
            if (step==100){
                winner=Thread.currentThread().getName();
                return true;
            }
        }
        return false;
    }
}
