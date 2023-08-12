package com.mydeveloperplanet.myspringbootconfigurationplanet.config3.controller;

import com.mydeveloperplanet.myspringbootconfigurationplanet.config3.config.MyProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    private final MyProperties myProperties;

    @Autowired
    public ConfigurationController(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @RequestMapping("/configuration")
    public String configuration() {
        StringBuilder result = new StringBuilder();
        result.append("Value of enabled = ").append(myProperties.isEnabled()).append("\n");
        result.append("Value of stringConfig = ").append(myProperties.getStringConfig()).append("\n");
        if (myProperties.getAdditional() != null) {
            result.append("Value of additional.addEnabled = ").append(myProperties.getAdditional().isAddEnabled()).append("\n");
            result.append("Value of additional.addString = ").append(myProperties.getAdditional().getAddString()).append("\n");
        }
        return result.toString();
    }
}
