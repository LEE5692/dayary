package com.demo.dayary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/root/**").addResourceLocations("classpath:/templates/root/");
                registry.addResourceHandler("/error/**").addResourceLocations("classpath:/templates/error/");
                registry.addResourceHandler("/font/**").addResourceLocations("classpath:/static/font/");
                registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
                registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");

            }
        };
    }
}