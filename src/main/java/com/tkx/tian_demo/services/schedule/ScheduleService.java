package com.tkx.tian_demo.services.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    public void reportCurrentTime(){
        System.out.println("每五秒执行一次" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "4 * * ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间执行" + dateFormat.format(new Date()));
    }

}
