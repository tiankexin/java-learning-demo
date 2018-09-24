package com.tkx.tian_demo.config;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.tkx.tian_demo.repository",
        mongoTemplateRef=DevDemoConfig.MONGO_TEMPLATE)
public class DevDemoConfig{

    static final String MONGO_TEMPLATE = "devMongoTemplate";

    @Value("${mongodb.dev_demo.uri}")
    private String devDemoUri;

    @Bean(name = MONGO_TEMPLATE)
    public MongoTemplate testMongoTemplate() throws Exception {
        MongoDbFactory dbFactory = new SimpleMongoDbFactory(new MongoClientURI(this.devDemoUri));
        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(dbFactory), new MongoMappingContext());
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return new MongoTemplate(dbFactory, converter);
    }
}
