package com.tkx.tian_demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class TestScopeDemo {

    public void play(){
        System.out.println("Let's play together!");
    }
}
