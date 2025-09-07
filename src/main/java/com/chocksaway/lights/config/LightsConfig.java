package com.chocksaway.lights.config;

import com.chocksaway.lights.entity.Light;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class LightsConfig {
    @Bean
    Light getYellowLight() {
        return new Light("yellow", false);
    }
    @Bean
    Light getRedLight() {
        return new Light("red", false);
    }
    @Bean
    Light getGreenLight() {
        return new Light("green", false);
    }
    @Bean
    Light getBlueLight() {
        return new Light("blue", false);
    }
}
