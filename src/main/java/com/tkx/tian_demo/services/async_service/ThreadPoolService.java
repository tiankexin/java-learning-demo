package com.tkx.tian_demo.services.async_service;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolService {

    class Task implements Runnable{
        int count;

        Task(int i){
            this.count = i;
        }

        @Override
        public void run(){
            try {
                System.out.println("In thread" + count);
                Thread.sleep(10000);

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  BlockingQueue<Runnable> createQueue(int queueCapacity) {
        return new LinkedBlockingQueue<>(queueCapacity);
    }

    public void process() throws InterruptedException {
        ThreadPoolService service = new ThreadPoolService();
        BlockingQueue<Runnable> queue = createQueue(10);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 4, 5,
                TimeUnit.SECONDS, queue, new ThreadPoolExecutor.AbortPolicy());

        for(int i = 0; i < 10; i++){
            pool.execute(new ThreadPoolService.Task(i));
        }
        pool.shutdown();
        while (pool.getPoolSize() != 0 ){
            Thread.sleep(5000);
        }
        System.out.println("Main thread end!");
    }

}
