package com.tkx.tian_demo.services.scope;

import com.tkx.tian_demo.config.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {
    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        ScopeService s1 = context.getBean(ScopeService.class);
        ScopeService s2 = context.getBean(ScopeService.class);
        System.out.println("AAAAAAAAAAAAAAAA");
        System.out.println(s1==s2);
        ScopeDemoService p1 = context.getBean(ScopeDemoService.class);
        ScopeDemoService p2 = context.getBean(ScopeDemoService.class);
        System.out.println(p1==p2);

    }

}
