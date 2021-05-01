package com.uk.sprint.rest;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Service
public class WireMockManager {

    WireMockServer wireMockServer;

    @Value("${wiremock.base-url}")
    private URI baseUrl;

    @PostConstruct
    public void startWireMockServer() {
        log.info("started wiremock server");
        wireMockServer = new WireMockServer(WireMockConfiguration
                .options().port(baseUrl.getPort())
                .usingFilesUnderClasspath("responses"));
        wireMockServer.start();
    }

    public WireMockServer getWireMockServer() {
        return wireMockServer;
    }

    @PreDestroy
    public void stopServer() {
        log.info("stopped wiremock server");
        wireMockServer.stop();
    }

    public void resetAll() {
        if (wireMockServer != null) {
            wireMockServer.start();
            wireMockServer.resetAll();
            wireMockServer.resetMappings();
            log.info("reset completed");
        }
    }

}
