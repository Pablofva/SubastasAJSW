package com.unaj.ajsw.tp.repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.Value;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

public class MongoConfig {
    @Configuration
    @EnableMongoRepositories({"com.picandgo.repository"})
    public class MongoConfig extends AbstractMongoClientConfiguration {

        private String url;

        public MongoConfig(@Value("${spring.data.mongodb.uri}") String url) {
            this.url = url;
        }

        protected String getDatabaseName() {
            return "security";
        }

        private MongoProperties properties = new MongoProperties();

        @Bean
        public MongoClient mongoClient(){
            return MongoClients.create(url);
}
