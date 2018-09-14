package com.tkx.tian_demo.repository.dev;


import com.tkx.tian_demo.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {
    public Person findByName(String name);
    public List<Person> findByAge(Integer age);
}
