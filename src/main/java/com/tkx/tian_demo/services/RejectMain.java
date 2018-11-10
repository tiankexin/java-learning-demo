package com.tkx.tian_demo.services;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class RejectMain {

    public static void main(String [] args) throws IllegalAccessException {
        RejectService rs = new RejectService("tkx", 123);
        Class<?> rcls = rs.getClass();
        Field[] fields = rcls.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getGenericType());
            Type a = field.getGenericType();
            field.setAccessible(true);
            System.out.println(field.get(rs));
        }

    }
}
