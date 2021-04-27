package com.uk.sprint.rest;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.uk.sprint.rest.SprintApplication;
import io.cucumber.java8.En;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = SprintApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test-cucumber")
@Slf4j
@CucumberContextConfiguration
public class CucumberSpringContextLoader implements En {

    @Autowired
    WireMockServer wireMockServer;

    CucumberSpringContextLoader() {
        After(scenario -> {
            wireMockServer.resetAll();
        });
    }
}
