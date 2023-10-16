package com.bnta.chocolate.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**") // allows all mappings
                .allowedOrigins("*") // '*' means all origins are allowed
                .allowedHeaders("*")
                .allowedMethods("*");
    }
}
