package com.tkx.tian_demo.services.async_service;

import com.tkx.tian_demo.config.AsyncConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncMain {

    public static void main(String [] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AsyncConfig.class);
        context.refresh();
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i=0; i<10; i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }


}
