package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileApplication {
    public static void main(String[] args) {

        //System.setProperty("spring.profiles.default", "dev");
        System.setProperty("spring.profiles.default", "qa");

        SpringApplication.run(SpringProfileApplication.class, args);
    }
}
