package com.todo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.todo")
@PropertySource("classpath:test.properties")
public class TestConfig {
    {
        com.codeborne.selenide.Configuration.headless = true;
    }
}
