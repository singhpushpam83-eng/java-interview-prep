package com.example.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI orderServiceAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Order Service API")
                        .description("Spring Boot Order Service")
                        .version("1.0"));
    }
}
