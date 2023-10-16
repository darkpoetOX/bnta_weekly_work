package com.codetests.bnta.petAPI.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Configure which route in the controller the mapping applies to (line of code below)
        registry.addMapping("/pets")
                // Configure which route in the controller the mapping applies to (line of code below)
                .allowedOrigins("http://localhost:3000")
                // Acceptable parameters for headers, eg. authentication, content-type, etc
                .allowedHeaders("*")
                // HTTP methods the origin is allowed to make
                .allowedMethods("GET", "POST");
        registry.addMapping("/pets/{id}")
                .allowedOrigins("http://localhost:3000")
                .allowedHeaders("*")
                .allowedMethods("DELETE");
    }

}
