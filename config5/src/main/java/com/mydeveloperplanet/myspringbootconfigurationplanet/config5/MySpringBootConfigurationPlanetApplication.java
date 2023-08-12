package com.mydeveloperplanet.myspringbootconfigurationplanet.config5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.mydeveloperplanet.myspringbootconfigurationplanet.config5.config")
public class MySpringBootConfigurationPlanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootConfigurationPlanetApplication.class, args);
	}

}
