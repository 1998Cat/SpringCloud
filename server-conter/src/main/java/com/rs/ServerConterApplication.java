package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerConterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConterApplication.class, args);
    }
}
