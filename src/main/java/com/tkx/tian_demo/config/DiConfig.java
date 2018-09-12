package com.tkx.tian_demo.config;

import com.tkx.tian_demo.services.FunctionService;
import com.tkx.tian_demo.services.scope.JSP250FunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tkx.tian_demo.services")
public class DiConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    JSP250FunctionService jsp250FunctionService(){
        return new JSP250FunctionService();
    }

}
