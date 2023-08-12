package com.mydeveloperplanet.myspringbootconfigurationplanet.config3.config;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("my.properties")
public class MyProperties {

    private boolean enabled;

    private String stringConfig;

    private final Additional additional = new Additional();

    @Getter
    @Setter
    public static class Additional {

        private boolean addEnabled;

        private String addString;

    }

}
