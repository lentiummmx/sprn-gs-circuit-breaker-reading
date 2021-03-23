package com.globant.circuitbreakerreading.cfgs;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@Configuration
public class CircuitBreakerConfig {

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }
}
