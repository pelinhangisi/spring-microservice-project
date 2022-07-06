package com.pelinhangisi.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced
    // WebClient kullanabilmek adına pom.xml e "webflux" dependency eklemesi yapılır
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
}
