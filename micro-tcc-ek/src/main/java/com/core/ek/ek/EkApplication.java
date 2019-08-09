package com.core.ek.ek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EkApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkApplication.class, args);
    }

}
