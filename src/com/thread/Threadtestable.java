package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Threadtestable implements Runnable {
    private static Logger logger = LogManager.getLogger();
    @Override
    public void run() {
        Thread.currentThread().setName("实现runnable接口");
        logger.error(Thread.currentThread().getName());
    }
}
