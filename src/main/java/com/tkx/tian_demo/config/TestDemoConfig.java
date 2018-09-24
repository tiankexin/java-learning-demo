package com.tkx.tian_demo.config;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@Configuration
//@EnableMongoRepositories(basePackages = "com.tkx.tian_demo.repository.test",
//        mongoTemplateRef=TestDemoConfig.MONGO_TEMPLATE)
//public class TestDemoConfig {
//
//    static final String MONGO_TEMPLATE = "testMongoTemplate";
//
//    @Value("${mongodb.test_demo.uri}")
//    private String testDemoUri;
//
//    @Bean(name = MONGO_TEMPLATE)
//    @Primary
//    public MongoTemplate testMongoTemplate() throws Exception {
//        MongoDbFactory dbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.testDemoUri));
//        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(dbFactory), new MongoMappingContext());
//        return new MongoTemplate(dbFactory, converter);
//    }
//}
