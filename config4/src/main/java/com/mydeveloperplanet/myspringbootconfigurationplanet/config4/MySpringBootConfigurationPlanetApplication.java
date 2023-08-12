package com.mydeveloperplanet.myspringbootconfigurationplanet.config4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.mydeveloperplanet.myspringbootconfigurationplanet.config4.config")
public class MySpringBootConfigurationPlanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootConfigurationPlanetApplication.class, args);
	}

}
