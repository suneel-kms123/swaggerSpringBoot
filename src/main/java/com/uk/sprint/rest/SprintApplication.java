package com.uk.sprint.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.retry.annotation.EnableRetry;


@EnableRetry
@EnableCaching
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages = "com.uk.sprint")
@EntityScan(basePackages = "com.uk.sprint")
@EnableJpaRepositories(basePackages = "com.uk.sprint.repository")
public class SprintApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintApplication.class, args);
    }

}
