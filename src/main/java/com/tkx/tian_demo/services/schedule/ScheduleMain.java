package com.tkx.tian_demo.services.schedule;

import com.tkx.tian_demo.config.ScheduleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduleMain {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
    }
}
