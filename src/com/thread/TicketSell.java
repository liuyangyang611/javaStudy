package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TicketSell implements Runnable{
    private static Logger logger = LogManager.getLogger();
    int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket>0){
                logger.error(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                ticket--;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicketSell ticketSell = new TicketSell();
        new Thread(ticketSell,"小明").start();
        new Thread(ticketSell,"黄牛").start();
    }
}
