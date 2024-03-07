package com.vivek.notes.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Add the origin of your client application
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Add the HTTP methods you want to allow
                .allowCredentials(true); // Allow cookies and authorization headers
    }
}
