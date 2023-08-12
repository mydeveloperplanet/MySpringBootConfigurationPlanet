package com.mydeveloperplanet.myspringbootconfigurationplanet.config4.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestIT {

    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void configurationShouldReturnProperties() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/configuration",
                String.class)).contains("""
                Value of enabled = false
                Value of stringConfig = First piece
                Value of additional.addEnabled = false
                Value of additional.addString = First piece Second piece""");
    }
}
