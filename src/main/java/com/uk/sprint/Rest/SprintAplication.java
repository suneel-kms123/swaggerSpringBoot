package com.uk.sprint.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


//@EnableRetry
@EnableCaching
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.uk.sprint.Rest")
public class SprintAplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintAplication.class, args);
    }

}
