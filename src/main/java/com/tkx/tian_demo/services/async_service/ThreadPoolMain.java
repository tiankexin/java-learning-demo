package com.tkx.tian_demo.services.async_service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolMain {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolService service = new ThreadPoolService();
        service.process();
    }
}
