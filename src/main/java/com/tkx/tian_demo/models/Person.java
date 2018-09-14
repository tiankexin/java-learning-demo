package com.tkx.tian_demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Person {

    @Id
    private String id;

    private String name;

    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format(
                "Person[id=%s, Name='%s', Age='%s']",
                id, name, age.toString());
    }
}
