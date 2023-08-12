package com.mydeveloperplanet.myspringbootconfigurationplanet.config1.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mydeveloperplanet.myspringbootconfigurationplanet.config1.config.MyProperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
@EnableConfigurationProperties(MyProperties.class)
public class WebLayerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void configurationShouldReturnProperties() throws Exception {
        this.mockMvc.perform(get("/configuration")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("""
                        Value of enabled = false
                        Value of stringConfig = First piece
                        Value of additional.addEnabled = false
                        Value of additional.addString = First piece Second piece""")));
    }

}
