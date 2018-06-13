package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProduceApplication.class, args);
        new Scanner(System.in).next();
    }
}
