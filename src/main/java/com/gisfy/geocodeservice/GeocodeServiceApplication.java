package com.gisfy.geocodeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GeocodeServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(GeocodeServiceApplication.class, args);
    }

}
