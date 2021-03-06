package com.hack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

/**
 * @author lnurullina
 */
@Configuration
@ComponentScan("com.hack")
@PropertySource("classpath:app.properties")
public class CoreConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
