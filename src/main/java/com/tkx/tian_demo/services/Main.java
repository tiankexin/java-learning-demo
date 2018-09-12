package com.tkx.tian_demo.services;


import com.tkx.tian_demo.config.DiConfig;
import com.tkx.tian_demo.services.scope.JSP250FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UserFunctionService userService = context.getBean(UserFunctionService.class);
        System.out.println(userService.sayHello("tiankexin"));
        JSP250FunctionService jsp250FunctionService = context.getBean(JSP250FunctionService.class);
        jsp250FunctionService.sayHello("xvjingyao");
        context.close();
    }
}
