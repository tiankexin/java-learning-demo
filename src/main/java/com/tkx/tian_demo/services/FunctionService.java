package com.tkx.tian_demo.services;

import org.springframework.stereotype.Service;

public class FunctionService {

    public void init(){
        System.out.println("begin to say hello");
    }

    public String sayHello(String word){
        return "Hello" + word + "!";
    }

    public void destory(){
        System.out.println("end of hello");
    }
}
