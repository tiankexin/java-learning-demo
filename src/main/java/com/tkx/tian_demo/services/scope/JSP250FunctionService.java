package com.tkx.tian_demo.services.scope;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSP250FunctionService {

    @PostConstruct
    public void init(){
        System.out.println("begin to say hello");
    }

    public String sayHello(String word){
        return "Hello" + word + "!";
    }

    @PreDestroy
    public void destory(){
        System.out.println("end of hello");
    }
}
