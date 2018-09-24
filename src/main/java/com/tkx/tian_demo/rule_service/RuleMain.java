package com.tkx.tian_demo.rule_service;

import com.sun.javafx.tools.ant.Resources;
import com.tkx.tian_demo.models.Product;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RuleMain {
    public static void main(String [] args){
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.newKieClasspathContainer();
        KieSession kSession = kc.newKieSession("ksession1");

        RuleApplication a = new RuleApplication();
        a.name = "Xiao,ming";
        a.age = 15;
        a.valid = true;
        kSession.insert(a);

        kSession.fireAllRules();
        kSession.dispose();

        System.out.println(a.valid);

        KieSession kSession2 = kc.newKieSession("ksession2");
        Product p = new Product();
        p.setType(Product.DIAMOND);
        kSession2.insert(p);

        kSession2.fireAllRules();
        kSession2.dispose();
        System.out.println("this product discount:" + p.getDiscount());

    }

}
