package com.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Threadtest extends Thread{
    private static Logger logger = LogManager.getLogger();

    @Override
    public void run() {
        Thread.currentThread().setName("测试线程");
        System.out.println("run");
        logger.error("这是测试类的日志"+Thread.currentThread().getName());
    }
}
