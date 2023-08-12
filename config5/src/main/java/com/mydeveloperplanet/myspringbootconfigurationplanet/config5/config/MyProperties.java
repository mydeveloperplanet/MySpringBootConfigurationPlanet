package com.mydeveloperplanet.myspringbootconfigurationplanet.config5.config;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@ConfigurationProperties("my.properties")
public class MyProperties {

    private final boolean enabled;

    private final String stringConfig;

    private final Additional additional;

    public MyProperties(boolean enabled, String stringConfig, @DefaultValue Additional additional) {
        this.enabled = enabled;
        this.stringConfig = stringConfig;
        this.additional = additional;
    }

    @Getter
    public static class Additional {

        private final boolean addEnabled;

        private final String addString;

        public Additional(boolean addEnabled, String addString) {
            this.addEnabled = addEnabled;
            this.addString = addString;
        }
    }

}
