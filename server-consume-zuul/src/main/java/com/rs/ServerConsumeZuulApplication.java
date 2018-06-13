package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ServerConsumeZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConsumeZuulApplication.class, args);
    }
}
