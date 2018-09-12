package com.tkx.tian_demo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.tkx.tian_demo.services.schedule")
@EnableScheduling
public class ScheduleConfig {

}
