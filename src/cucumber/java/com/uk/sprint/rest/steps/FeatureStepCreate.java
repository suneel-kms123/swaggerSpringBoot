package com.uk.sprint.rest.steps;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.http.Response;
import com.uk.sprint.rest.WireMockManager;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeatureStepCreate implements En {

    private Scenario scenario;

    public FeatureStepCreate(final WireMockManager wireMockManager) {
        Before(scenario -> {
            this.scenario = scenario;
        });

        Given("^API is available", () -> {
            wireMockManager.getWireMockServer().stubFor(WireMock
                    .get(WireMock.urlPathMatching("/api/v1/restApi"))
                    .willReturn(WireMock.aResponse().withStatus(200)));
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
