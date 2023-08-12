package com.mydeveloperplanet.myspringbootconfigurationplanet.config3.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class ApplicatonConfig {

}
