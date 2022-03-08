package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
@EnableCassandraRepositories(basePackages = "com.example.repository")
public class SpringBootApplication1 {
    public static void main(String args[]){
        SpringApplication.run(SpringBootApplication1.class, args);
    }
}
