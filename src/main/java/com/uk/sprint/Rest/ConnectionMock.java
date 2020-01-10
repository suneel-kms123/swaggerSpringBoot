package com.uk.sprint.Rest;

import org.springframework.web.client.RestTemplate;

public class ConnectionMock extends RestTemplate {

    public boolean getTestRunning(){
        getForEntity("https://123.13.13.13", ConnectionMock.class);
        return true;
    }


}
