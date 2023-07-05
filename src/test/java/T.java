import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

public class T {

    private RestTemplate restTemplate;
    private WireMockServer wireMockServer;

    @BeforeEach
    public void setUp() {
        this.restTemplate = new RestTemplate();
        this.wireMockServer = new WireMockServer(options().port(9001));
        this.wireMockServer.start();
        WireMock.configureFor(this.wireMockServer.port());
    }

    @Test
    public void testWireMockHttpRequest() {
        givenThat(any(anyUrl()).willReturn(aResponse().withStatus(200)));
        String serverUrl = buildApiMethodUrl();
        ResponseEntity<String> response = this.restTemplate.getForEntity(serverUrl,
                String.class
        );
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    }

    private String buildApiMethodUrl() {
        return String.format("http://localhost:%d/api/message",
                this.wireMockServer.port()
        );
    }


    public void tearDown() {
        wireMockServer.stop();
    }
}
