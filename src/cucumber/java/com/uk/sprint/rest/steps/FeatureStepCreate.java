package com.uk.sprint.rest.steps;

import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeatureStepCreate implements En {

    private Scenario scenario;

    public FeatureStepCreate() {
        Before(scenario -> {
            this.scenario = scenario;
        });

        Given("^API is available", () -> {
            log.info("cucumber on a roll");
        });

        When("^call the first rest API$", () -> {
            RestAssured.given()
                    .accept(ContentType.JSON)
                    .when()
                    .get("/api/v1/restApi")
                    .then().assertThat().statusCode(200);
        });

        Then("cucumber is successfull", () -> {
            log.info("success");
        });

    }

}
