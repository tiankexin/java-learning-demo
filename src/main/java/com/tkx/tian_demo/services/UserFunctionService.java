package com.tkx.tian_demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        System.out.println("Say hello from user!");
        return functionService.sayHello(word);
    }
}
